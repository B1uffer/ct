package com.b1uffer;

public class PizzaTwo {
    public int solution(int n) {
        int answer = 0;

        int a = gcd(6, n);
        int pizza = (n * 6) / a;
        answer = pizza / 6;
        return answer;
    }

    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
