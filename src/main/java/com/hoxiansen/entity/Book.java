package com.hoxiansen.entity;


public class Book {

  private Integer id;
  private String bookName;
  private String picture;
  private Double price;
  private String sellTime;
  private Integer num;
  private Integer sellState;
  private Integer subscribe;


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


  public String getSellTime() {
    return sellTime;
  }

  public void setSellTime(String sellTime) {
    this.sellTime = sellTime;
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


  public Integer getSubscribe() {
    return subscribe;
  }

  public void setSubscribe(Integer subscribe) {
    this.subscribe = subscribe;
  }

}
