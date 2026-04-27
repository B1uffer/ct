package com.b1uffer;

public class SumSum {
    /**
     * 정수 n이 주어질 때, n 이하의 짝수를 모두 더한값을
     * return하도록 solution 함수 작성하기
     */
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) { // 1
                answer += i;
            }
        }
        return answer;
    }
}
