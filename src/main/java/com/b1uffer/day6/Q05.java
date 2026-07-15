package com.b1uffer.day6;

import java.util.*;

public class Q05 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int[] ar = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
            int min = -1;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                int k = queries[i][2]; // 이걸 기준으로 비교
                if(arr[j] > k) { // k보다 크므로 무조건 양수
                    if(min == -1) {
                        min = arr[j]; // 첫번째 값은 무조건 이 if문을 거친다
                    } else if(arr[j] < min) {
                        min = arr[j];
                    }
                }
            } // j for문 끝
            ar[i] = min;
        } // i for문 끝
        answer = ar;
        return answer;
    }

    public static void main(String[] args) {
        Q05 q = new Q05();
        int[] ar = {0,1,2,4,3};
        int[][] arar = {{0,4,2},{0,3,2},{0,2,2}};
        System.out.println(Arrays.toString(q.solution(ar,arar)));
    }
}
