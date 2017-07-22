package com.example.michaelrobertson.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by michaelrobertson on 21/07/2017.
 */

public class Basket {

    private ArrayList<Item> contents;
    private Item item;

    public Basket() {
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

    public int getBasketTotal(){
        int total = 0;
        int itemPrice;
        for (Item item : contents){
            itemPrice = item.getPrice();
            total = total + itemPrice;
        }
        return total;
    }
}
