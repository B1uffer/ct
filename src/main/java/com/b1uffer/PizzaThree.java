package com.b1uffer;

public class PizzaThree {
    public int solution(int slice, int n) { // n이 먹는 사람의 수, slice는 피자 조각 수
        int answer = 0;
        int pizza = 1;
        int a = 0; // 피자 조각의 수, 결과물

        while(a < n) {
            a = slice * pizza;
            if(a >= n) {
                break;
            }
            pizza++;
        }
        answer = pizza;
        /**
         * 만약 14명이 5조각으로 자른 피자를 최소한 1조각씩 먹으려면
         * 최소 3판의 피자가 필요함(15)
         * 핵심은 slice * pizza
         */

        return answer;
    }
}
