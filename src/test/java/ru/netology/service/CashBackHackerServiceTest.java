package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CashBackHackerServiceTest {
    @Test
    void quantityIsLessThanTheLimit() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    void amountEqualBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    void amountMoreBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}