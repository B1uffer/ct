package com.b1uffer;

public class NumOfNumList {
    /**
     * 정수가 담긴 리스트 num_list가 주어질 때,
     * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을
     * return하도록 solution함수 완성하기
     */
    public int[] solution(int[] num_list) { // 리스트
        int[] answer = {};
        answer = new int[2];
        int a = 0;
        int b = 0;

        for(int i = 0; i < num_list.length; i++) {
            int number = num_list[i];
            if(number % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }
        answer[0] = a;
        answer[1] = b;

        return answer;
    }
}
