package com.company;

import com.company.IVendingMachine;

public class VendingMachineImpl implements IVendingMachine {

    BankStorage bankStorage;
    VendingStorage vendingStorage;

    public VendingMachineImpl() {
        this.bankStorage = new BankStorage();
        this.vendingStorage = new VendingStorage();
    }

    @Override
    public void getProduct(ProductItem productItem) {

    }

    @Override
    public void addMoney(MoneyType moneyType, int moneyValue) {

    }
}
