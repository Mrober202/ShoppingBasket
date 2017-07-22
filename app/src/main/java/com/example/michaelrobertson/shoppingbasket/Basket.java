package com.example.michaelrobertson.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by michaelrobertson on 21/07/2017.
 */

public class Basket {

    private ArrayList<Item> contents;
    private Customer customer;
    private Item item;
    double total = 0;
    double totalD = 0;
    double totalMember = 0;

    public Basket() {
        customer = new Customer(true);
        contents = new ArrayList<Item>();
        contents.add(new Item(10, "Sugar"));
        contents.add(new Item(10, "Sugar"));
        contents.add(new Item(5, "Beer"));
    }

    public ArrayList<Item> getContents() {
        return new ArrayList<Item>(contents);
    }

    public int numberOfItemsInBasket() {
        int number = contents.size();
                return number;
    }

    public void addToBasket() {
        contents.add(item);
    }

    public void removeFromBasket() {
        contents.remove(item);
    }

    public void emptyBasket() {
        contents.clear();
    }

    public double getBasketTotal(){
        int itemPrice;
        for (Item item : contents){
            itemPrice = item.getPrice();
            total = total + itemPrice;
        }
        return total;
    }

    public double twentyPercentDiscount() {
        if (total >= 20) {
            return totalD = total * 0.8;
        }
        return totalD;
    }

    public double memberDiscount() {
        if (customer.customerHasCard()) {
            return totalMember = totalD * 0.98;
        }
        return totalMember;
    }
}
