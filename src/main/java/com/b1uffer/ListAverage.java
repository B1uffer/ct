package com.b1uffer;

import java.util.Arrays;

public class ListAverage {
    public double solution(int[] numbers) {
        /**
         * 정수배열 numbers가 매개변수로 주어진다
         * numbers의 원소의 평균값을 return하도록 solution함수를 완성하세요
         */
        double answer = 0;
        double sum = 0;

        Arrays.stream(numbers).average().orElse(0);

        for(int i = 0; i< numbers.length; i++) {
            sum += numbers[i];
            answer = sum / numbers.length;
        }

        return answer;
    }
}
