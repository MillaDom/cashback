package ru.netology.service;

public class CashbackServiceTest {

    @org.testng.annotations.Test
    public void shouldAddAmountIfLess1000() {
        CashbackService service = new CashbackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAddAmountIfMore1000() {
        CashbackService service = new CashbackService();
        int amount = 1200;
        int expected = 800;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldNotAddAmountIf1000() {
        CashbackService service = new CashbackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }
}