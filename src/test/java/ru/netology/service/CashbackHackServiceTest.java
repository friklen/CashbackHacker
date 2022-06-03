package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void ShouldReturn2000Amount2000() {

        int actual = service.remain(2000);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    public void ShouldReturn900Amount100() {

        int actual = service.remain(100);
        int expected = 900;

        assertEquals(actual, expected);

    }


    @Test
    public void ShouldReturn500Amount500() {

        int actual = service.remain(500);
        int expected = 500;

        assertEquals(actual, expected);

    }

    @Test
    public void ShouldReturn1000Amount1000() {

        int actual = service.remain(1000);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    public void ShouldReturn950Amount1050() {

        int actual = service.remain(1050);
        int expected = 950;

        assertEquals(actual, expected);

    }
}