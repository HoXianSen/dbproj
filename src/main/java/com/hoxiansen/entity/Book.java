package com.hoxiansen.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tb_book", schema = "demo")
public class Book {
    private Integer id;
    private String name;
    private String picture;
    private BigDecimal price;
    private Integer count;
    private Byte sell;
    private Byte subscribe;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "picture")
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "sell")
    public Byte getSell() {
        return sell;
    }

    public void setSell(Byte sell) {
        this.sell = sell;
    }

    @Basic
    @Column(name = "subscribe")
    public Byte getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Byte subscribe) {
        this.subscribe = subscribe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(name, book.name) &&
                Objects.equals(picture, book.picture) &&
                Objects.equals(price, book.price) &&
                Objects.equals(count, book.count) &&
                Objects.equals(sell, book.sell) &&
                Objects.equals(subscribe, book.subscribe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, picture, price, count, sell, subscribe);
    }
}
