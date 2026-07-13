package com.b1uffer.day6;

public class Q04 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i=0; i<queries.length; i++) {
            int temp = arr[queries[i][0]]; // 0
            arr[queries[i][0]] = arr[queries[i][1]]; // 3
            arr[queries[i][1]] = temp; // 0
        }
        answer = arr;
        return answer;
    }
}
