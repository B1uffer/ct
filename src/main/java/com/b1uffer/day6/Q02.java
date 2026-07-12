package com.b1uffer.day6;

import java.util.*;

public class Q02 {
    /**
     * 정수 n과 문자열 control이 주어진다
     * control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며
     * control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꾼다
     *
     * - "w" : n이 1 커진다
     * - "s" : n이 1 작아진다
     * - "d" : n이 10 커진다
     * - "a" : n이 10 작아진다
     *
     * 위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return하는 solution 함수 완성하기
     */
    public int solution(int n, String control) {
        int answer = 0;
        StringBuffer sb = new StringBuffer(control);
        for(int i=0; i<sb.length(); i++) {
            if(sb.substring(i,i+1).equals("w")) {
                n++;
            } else if(sb.substring(i,i+1).equals("s")) {
                n--;
            } else if(sb.substring(i,i+1).equals("d")) {
                n += 10;
            } else if(sb.substring(i,i+1).equals("a")) {
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
    public static void main(String[] args) {
        Q02 q = new Q02();
        System.out.println(q.solution(0,"wsdawsdassw"));
    }
}
