package com.company;

import java.util.HashMap;
import java.util.Map;

public class BankStorage {

    Map<MoneyItem, Integer> storedMoneyItems;

    public BankStorage() {
        storedMoneyItems = new HashMap<>();
        /*storedMoneyItems.put(new MoneyItem(MoneyType.COIN, 10), );
        storedMoneyItems.put(new MoneyItem(MoneyType.COIN, 50), );
        storedMoneyItems.put(new MoneyItem(MoneyType.BILL, 1), );
        storedMoneyItems.put(new MoneyItem(MoneyType.BILL, 5), );
        storedMoneyItems.put(new MoneyItem(MoneyType.BILL, 10), );*/
    }
}
