package com.b1uffer;

public class Hate {
    public int[] solution(int n) {
        int[] answer = {};
        /**
         * 9의 홀수의 갯수 = 5개 9 = 2x4 + 1
         * 10의 홀수의 갯수 = 5개  = 2x5
         * 15의 홀수의 갯수 = 8개 = 2x7 + 1
         * 16의 홀수의 갯수 = 8개 = 2x8
         * 17의 홀수의 갯수 = 9개 = 2x8 + 1
         * 18의 홀수의 갯수 = 9개 = 2x9
         */
            // 홀수라면
            if(n%2==1) {
                int a = n + 1;
                int b = a/2; // 홀수의 갯수
                int c = 1;
                answer = new int[b]; // 홀수의 갯수만큼 배열을 만듬
                for(int i = 1; i<=b; i++) {
                    if(i>=2) {
                        c = c + 2;
                        answer[i-1] = c;
                    } else { // i<2, i=1
                        c = 1;
                        answer[i-1] = c;
                    }
                }
            } else {
                int b = n/2; // 홀수의 갯수
                int c = 1;
                answer = new int[b];
                for(int i = 1; i<=b; i++) {
                    if(i>=2) {
                        c = c + 2;
                        answer[i-1] = c;
                    } else {
                        c = 1;
                        answer[i-1] = c;
                    }
                }
            }

        return answer;
    }
}
