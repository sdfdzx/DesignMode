package com.example.xuan.designmode.decorator;

/**
 * Author : xuan.
 * Data : 2017/8/1.
 * Description :input the description of this file.
 */

public class Sugar extends CondimentDecorator {
    private Beverage mBeverage;

    public Sugar(Beverage beverage) {
        this.mBeverage = beverage;
    }

    @Override
    public String getDes() {
        return mBeverage.getDes() + ", add sugar";
    }

    @Override
    public double cost() {
        return mBeverage.cost() + 1.5;
    }
}
