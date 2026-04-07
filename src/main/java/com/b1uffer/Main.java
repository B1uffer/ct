package com.b1uffer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        int a = 4;
        int n = 12;
        int money = 5000;
        IceCoffee coffee = new IceCoffee();
        System.out.println(Arrays.toString(coffee.solution(money)));
    }
}