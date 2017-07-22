package com.example.michaelrobertson.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michaelrobertson on 22/07/2017.
 */

public class ItemTest {

    Item item;

    @Before
    public void setUp() throws Exception {
        item = new Item(10, "Sugar");
    }

    @Test
    public void canGetDetails() throws Exception {
        assertEquals(10, item.getPrice());
        assertEquals("Sugar", item.getType());
    }
}
