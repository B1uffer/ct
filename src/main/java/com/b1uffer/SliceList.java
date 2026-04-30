package com.b1uffer;

public class SliceList {
    /**
     * 정수 배열 numbers와 정수 num1, num2가 매개변수
     * numbers의 num1번째 인덱스부터
     * num2번째 인덱스까지 자른 정수배열을 return하기
     */
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = new int[num2 - num1 + 1]; // 3 - 1 + 1 = 3

        for(int i = 0; i < num2-num1+1; i++) {
            int number = numbers[num1+i-1];
            answer[i] = number;
        }
        return answer;
    }
}
