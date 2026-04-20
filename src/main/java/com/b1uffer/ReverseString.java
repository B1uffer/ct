package com.b1uffer;

public class ReverseString {
    /**
     * 문자열 my_string이 매개변수
     * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution함수 완성하기
     */
    public String solution(String my_string) { // abc
        String answer = "";
//        int length = my_string.length();
//
//        for(int i = length - 1; i >= 0; i--) {
//            char temp = my_string.charAt(i); // a charAt(0)
//            answer += temp; // c + b + a
//        }
        StringBuffer buffer = new StringBuffer(my_string);
        answer = buffer.reverse().toString();
        return answer;
    }
}
