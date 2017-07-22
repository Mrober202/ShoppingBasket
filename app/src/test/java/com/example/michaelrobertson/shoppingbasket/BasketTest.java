package com.example.michaelrobertson.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelrobertson on 22/07/2017.
 */

public class BasketTest {

    Basket basket;


    @Before
    public void setUp() throws Exception {
        basket = new Basket();
    }

    @Test
    public void testGetNumberOfItemsInBasket() throws Exception {
        basket.addToBasket();
        assertEquals(4, basket.numberOfItemsInBasket());
    }

    @Test
    public void testCanRemoveItemFromBasket() throws Exception {
        basket.removeFromBasket();
        assertEquals(3, basket.numberOfItemsInBasket());
    }

    @Test
    public void testCanEmptyBasket() throws Exception {
        basket.emptyBasket();
        assertEquals(0, basket.numberOfItemsInBasket());
    }

    @Test
    public void testCanGetTotal() throws Exception {
        assertEquals(25, basket.getBasketTotal(), 0);
    }

    @Test
    public void testCanApplyTwentyPercentDiscount() throws Exception {
        basket.getBasketTotal();
        assertEquals(20, basket.twentyPercentDiscount(), 0);
    }

    @Test
    public void testCustomerCard() throws Exception {
        basket.getBasketTotal();
        basket.twentyPercentDiscount();
        assertEquals(19.6, basket.memberDiscount(), 0);
    }
}
