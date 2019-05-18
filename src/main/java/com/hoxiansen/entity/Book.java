package com.hoxiansen.entity;


public class Book {

  private Integer id;
  private String bookName;
  private String picture;
  private Double price;
  private Integer num;
  private Integer sellState;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }


  public Integer getSellState() {
    return sellState;
  }

  public void setSellState(Integer sellState) {
    this.sellState = sellState;
  }

}
