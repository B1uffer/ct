package com.b1uffer.day6;

import java.util.*;

public class Q05 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int[] ar = new int[queries.length];
        int min = -1;

        for(int i=0; i<queries.length; i++) {
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                int k = queries[i][2];
                if(arr[j] > k) {
                    if(arr[j] < min) {
                        min = arr[j];
                    }
                }
            }
        }
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
