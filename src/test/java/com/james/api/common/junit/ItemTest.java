package com.james.api.common.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void print() {
        Item s = new Item();
        String s3 = s.print();
        System.out.println("-->"+s3);
        String s2 = "Hello";
        Assertions.assertEquals(s.print(), "Hello");
    }

    @Test
    void add() {
        Item s = new Item();
        Assertions.assertEquals(s.add(4,3),7);
    }
}