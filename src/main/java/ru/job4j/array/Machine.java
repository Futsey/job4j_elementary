package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int cash = money - price;

        for (int coinIndex = 0; coinIndex < coins.length; coinIndex++) {
            int currentCoin = coins[coinIndex];
            int divider = cash / currentCoin;
                while (divider-- > 0) {
                    rsl[size++] = currentCoin;
                    cash -= currentCoin;
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
