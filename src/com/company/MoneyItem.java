package com.company;

public class MoneyItem {

    MoneyType moneyType;
    int value;

    public MoneyItem() {
        this.moneyType = MoneyType.COIN;
        this.value = 10;
    }

    public MoneyItem(MoneyType moneyType, int value) {
        this.moneyType = moneyType;
        this.value = value;
    }

    public MoneyType getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
