package ru.netology.stats;

class StaticsService {
    // сумма всех продаж
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // средняя сумма продаж в месяц
    public long averageSum(long[] sales) {
        long sum = calculateSum(sales);
        long month = 0;
        for (long sale : sales) {
            month++;
        }
        return sum / month;
    }

    // номер месяца, в котором был пик продаж
    public long findMax(long[] sales) {
        long currentMax = sales[0];
        long monthNum = 0;
        long maxMonthNum = 0;
        for (long sale : sales) {
            monthNum++;
            if (currentMax <= sale) {
                currentMax = sale;
                maxMonthNum = monthNum;
            }
        }
        return maxMonthNum;
    }

    // номер месяца, в котором был минимум продаж
    public long findMin(long[] sales) {
        long currentMin = sales[0];
        long monthNum = 0;
        long minMonthNum = 0;
        for (long sale : sales) {
            monthNum++;
            if (currentMin > sale) {
                currentMin = sale;
                minMonthNum = monthNum;
            }
        }
        return minMonthNum;
    }

    // количество месяце, в которых продажи были ниже среднего
    public long lessAverage(long[] sales) {
        long average = averageSum(sales);
        long numMonths = 0;
        for (long sale : sales) {
            if (sale < average)
                numMonths++;
        }
        return numMonths;
    }

    // количество месяце, в которых продажи были выше среднего
    public long moreAverage(long[] sales) {
        long average = averageSum(sales);
        long numMonths = 0;
        for (long sale : sales) {
            if (sale > average)
                numMonths++;
        }
        return numMonths;
    }
}

