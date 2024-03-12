package ru.netology.stats.services;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSalesAllMonth(long[] sales) {
        int sumSales = 0;

        for (long number : sales) {
            sumSales += (int) number;
        }

        return sumSales;
    }

    public int averageSalesAmount(long[] sales) {
        int averageSales = 0;

        for (long number : sales) {
            averageSales += (int) number;
        }
        averageSales = averageSales / 12;

        return averageSales;
    }

    public int monthWithSalesMinAverage(long[] sales) {
        long minSalesMonth = averageSalesAmount(sales);
        int amtMonth = 0;
        for (long sale : sales) {
            if (sale < minSalesMonth) {
                amtMonth += +1;
            }
        }
        return amtMonth;
    }

    public int monthWithSalesMaxAverage(long[] sales) {
        long maxSalesMonth = averageSalesAmount(sales);
        int amtMonth = 0;
        for (long sale : sales) {
            if (sale > maxSalesMonth) {
                amtMonth += +1;
            }
        }
        return amtMonth;
    }
}
