package com.autobots.java.mobile_bank;

public class ExchangeRate {

    final static double USD = 1.0;
    final static double EUR = 1.1;
    final static double KGS = 0.011;
    static double convert(double amount, Currency from, Currency to) {
        double res = 0.0;
        if(from.equals(Currency.EUR) && to.equals(Currency.USD)) {
            res = amount * EUR;
        } else if (from.equals(Currency.USD) && to.equals(Currency.EUR)) {
            res = amount * USD / EUR;
        } else if (from.equals(Currency.KGS) && to.equals(Currency.EUR)) {
            res = amount / USD / EUR;
        } else if (from.equals(Currency.KGS) && to.equals(Currency.USD)) {
            res = amount / USD;
        } else if (from.equals(Currency.USD) && to.equals(Currency.KGS)) {
            res = amount / KGS;
        }else if (from.equals(Currency.EUR) && to.equals(Currency.KGS)) {
            res = amount / KGS / EUR;
        }
        return res;
    }
}