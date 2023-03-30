package com.epam.esm.handler;

import com.epam.esm.handler.entity.CustomMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ErrorController {

    @RequestMapping(path = "/error")
    public ResponseEntity<CustomMessage> handle(HttpServletRequest request) {
        CustomMessage customMessage = new CustomMessage();
        Integer code = (Integer) request.getAttribute("javax.servlet.error.status_code");
        customMessage.setErrorMessage("Something wrong with this request");
        customMessage.setErrorCode(code);
        return new ResponseEntity<>(
                customMessage, new HttpHeaders(),
                HttpStatus.BAD_REQUEST);
    }
}