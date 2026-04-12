package com.b1uffer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        int a = 40;
        int n = 12;
        int money = 5000;
        int[] arr = {1,2,3,4,5};
        ReverseList list = new ReverseList();
        System.out.println(Arrays.toString(list.solution(arr)));
    }
}