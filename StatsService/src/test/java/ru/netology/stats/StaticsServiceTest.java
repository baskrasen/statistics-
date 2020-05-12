package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StaticsService service = new StaticsService();
        long expected = 180;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);

    }

    @Test
    void averageSum() {
        StaticsService service = new StaticsService();
        long expected = 15;
        long actual = service.averageSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StaticsService service = new StaticsService();
        long expected = 8;
        long actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StaticsService service = new StaticsService();
        long expected = 9;
        long actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void lessAverage() {
        StaticsService service = new StaticsService();
        long expected = 5;
        long actual = service.lessAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void moreAverage() {
        StaticsService service = new StaticsService();
        long expected = 5;
        long actual = service.moreAverage(sales);
        assertEquals(expected, actual);
    }
}