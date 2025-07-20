package com.cn.cnkart.entity;

import javax.persistence.*;

@Entity
@Table(name ="itemdetails")
public class ItemDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String brand;

    @Column
    private double price;

    @Column
    private String category;

    @OneToOne(mappedBy = "itemDetails", cascade = CascadeType.ALL)
    private Item item;

    public ItemDetails(){}

    public ItemDetails(String brand, double price, String category) {
        this.brand = brand;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
