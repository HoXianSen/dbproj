package com.hoxiansen.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private Integer id;
    private String bookName;
    private String picture;
    private Double price;
    private Integer num;
    private Integer sellNum;
    private Integer sellState;
}
