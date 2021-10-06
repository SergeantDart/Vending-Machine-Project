package com.company;

public interface IVendingMachine {
    void getProduct(ProductItem productItem);
    void addMoney(MoneyType moneyType, int moneyValue);
}
