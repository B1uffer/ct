package com.b1uffer;

import java.util.*;

public class Age {
    /**
     * 선생님이 몇년도에 태어났는지 궁금함
     * 2022년 기준 선생님의 나이 age가 주어질 때
     * 선생님의 출생 연도를 return하는 solution함수 완성하기
     * 0 < age <= 120
     * 나이는 태어난 년도에 1살이며, 매년 1월 1일마다 1살씩 증가한다
     */
    public int solution(int age) {
        int answer = 0;
        int year = 2022;
        answer = year - age + 1;

        return answer;
    }
}
