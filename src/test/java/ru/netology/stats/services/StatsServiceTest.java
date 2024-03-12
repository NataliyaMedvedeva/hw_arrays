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

        int expected = 180;
        int actual = StatsService.sumSalesAllMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcAverageSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = StatsService.averageSalesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMonthWithSalesMinAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = StatsService.monthWithSalesMinAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMonthWithSalesMaxAverage() {
        StatsService service = new StatsService();

        long[] sales = {18, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = StatsService.monthWithSalesMaxAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
