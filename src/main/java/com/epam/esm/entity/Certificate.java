package com.epam.esm.entity;

import lombok.Data;

@Data
public class Certificate {
    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private Integer duration;
    private String createDate;
    private String lastUpdateDate;
}
