package com.example.michaelrobertson.shoppingbasket;

/**
 * Created by michaelrobertson on 21/07/2017.
 */

public class Item {

    private int price;
    private String type;

    public Item(int price, String type) {
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

}
