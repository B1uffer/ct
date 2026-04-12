package com.b1uffer;

public class ReverseList {
    /**
     * 정수가 들어있는 배열 num_list가 매개변수
     * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성하세요
     */
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int length = num_list.length; // 5
        answer = new int[length];

        for(int i = 0; i < num_list.length; i++) { // 0,1,2,3,4
            int num = num_list[i];
            answer[length-i-1] = num;
        }
        return answer;
    }
}
