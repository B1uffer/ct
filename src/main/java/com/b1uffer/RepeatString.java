package com.b1uffer;

public class RepeatString {
    /**
     * 문자열 my_string과 정수 n이 매개변수로 주어질 때,
     * my_string에 들어 있는 각 문자를 n만큼 반복한 문자열을
     * return하도록 함수 완성하기
     * my_string이 "hello", n = 3이면 결과는 "hhheeellllllooo"
     */
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            char str = my_string.charAt(i);
            for(int j = 0; j < n; j++) {
                answer += str;
            }
        }
        return answer;
    }
}
