package com.b1uffer.etc;

import java.util.Arrays;

public class DoctorList {
    /**
     * 외과의사 머쓱이, 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정한다
     * 정수 배열 emergency 가 매개변수로 주어질 때,
     * 응급도가 높은 순서대로 진료 순서를 정한 배열을 return 하도록 solution 함수 완성하기
     * [3, 76, 24] - > [3, 1, 2]
     */
    public int[] solution(int[] emergency) {
        int[] answer = {};
        answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++) {
            int rank = 1;
            for(int j=0; j<emergency.length; j++) {
                // 3, 76, 24를 3이랑 비교해서 더 크다면 3은 후순위로 밀리게 된다
                if(emergency[j] > emergency[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }

    public static void main(String[] args) {
        DoctorList dl = new DoctorList();
        int[] emergency = {3,76,24};
        System.out.println(Arrays.toString(dl.solution(emergency)));
    }
}
