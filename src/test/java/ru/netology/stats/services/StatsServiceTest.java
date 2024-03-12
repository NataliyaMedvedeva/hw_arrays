package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calcMonthMinSales() {
        StatsService service = new StatsService();

        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(minMonth);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void calcMonthMaxSales() {
        StatsService service = new StatsService();

        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(maxMonth);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void calcSumAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sumSalesAllMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcAverageSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMonthWithSalesMinAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.monthWithSalesMinAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMonthWithSalesMaxAverage() {
        StatsService service = new StatsService();

        long[] sales = {18, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 6;
        long actual = service.monthWithSalesMaxAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
