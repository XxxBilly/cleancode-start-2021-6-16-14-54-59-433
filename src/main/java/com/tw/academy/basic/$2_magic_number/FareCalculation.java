package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

  private static final int DISCOUNT_80_PERCENTS_MIN = 100;
  private static final int DISCOUNT_80_PERCENTS_MAX = 150;
  private static final double DISCOUNT_80_PERCENTS = 0.8;

  private static final int DISCOUNT_50_PERCENTS_MIN = 150;
  private static final int DISCOUNT_50_PERCENTS_MAX = 400;
  private static final double DISCOUNT_50_PERCENTS = 0.5;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= DISCOUNT_80_PERCENTS_MIN && cumulativeExpensesThisMonth < DISCOUNT_80_PERCENTS_MAX) {
          return originalPrice * DISCOUNT_80_PERCENTS;
        }
        if (cumulativeExpensesThisMonth >= DISCOUNT_50_PERCENTS_MIN && cumulativeExpensesThisMonth < DISCOUNT_50_PERCENTS_MAX) {
            return originalPrice * DISCOUNT_50_PERCENTS;
        }
        return originalPrice;
    }
}
