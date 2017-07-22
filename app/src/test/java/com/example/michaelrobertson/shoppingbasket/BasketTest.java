package com.example.michaelrobertson.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelrobertson on 22/07/2017.
 */

public class BasketTest {

    Basket basket;
    Item item;

    @Before
    public void setUp() throws Exception {
        basket = new Basket();
        item = new Item(10);
    }

    @Test
    public void testGetNumberOfItemsInBasket() throws Exception {
        basket.addToBasket();
        assertEquals(1, basket.numberOfItemsInBasket());
    }

}
