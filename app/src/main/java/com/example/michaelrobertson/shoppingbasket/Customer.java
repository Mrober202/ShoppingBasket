package com.example.michaelrobertson.shoppingbasket;

/**
 * Created by michaelrobertson on 22/07/2017.
 */

public class Customer {

    private boolean card;

    public Customer(boolean card) {
        this.card = card;
    }

    public boolean customerHasCard() {
        return card = true;
    }

    public boolean customerDoesntHaveCard() {
        return card = false;
    }
}
