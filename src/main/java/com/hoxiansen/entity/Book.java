package com.hoxiansen.entity;


public class Book {

  private Integer id;
  private String name;
  private String picture;
  private Double price;
  private Integer count;
  private Integer sell;
  private Integer subscribe;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  public Integer getSell() {
    return sell;
  }

  public void setSell(Integer sell) {
    this.sell = sell;
  }


  public Integer getSubscribe() {
    return subscribe;
  }

  public void setSubscribe(Integer subscribe) {
    this.subscribe = subscribe;
  }

}
