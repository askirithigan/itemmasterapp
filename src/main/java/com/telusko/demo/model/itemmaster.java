package com.telusko.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="item_master")
public class itemmaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Column(name="item_name")
    private String itemName;

    @Column(name="item_code")
    private String itemCode;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "itemmaster{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemCode='" + itemCode + '\'' +
                '}';
    }

    public itemmaster(String itemName, String itemCode) {
        this.itemName = itemName;
        this.itemCode = itemCode;
    }

    public itemmaster(Long id, String itemName, String itemCode) {
        this.id = id;
        this.itemName = itemName;
        this.itemCode = itemCode;
    }

    public itemmaster(){

    }
}
