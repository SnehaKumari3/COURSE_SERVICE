package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction {
    @Id
    private long id;
    private long price;
    private String description;
    private String category;
    private String modeOfPayment;
    private String dateTime;

    public Transaction(long id, long price, String description, String category, String modeOfPayment, String dateTime) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.category = category;
        this.modeOfPayment = modeOfPayment;
        this.dateTime = dateTime;
    }
    public Transaction(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", modeOfPayment='" + modeOfPayment + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }

}
