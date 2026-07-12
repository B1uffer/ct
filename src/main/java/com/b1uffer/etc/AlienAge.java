package com.b1uffer.etc;

import java.util.stream.Collectors;

public class AlienAge {
    /**
     * 우주여행을 하던 머쓱이, 엔진 고장으로 PROGRAMMERS-962 행성에 불시착함!
     * 입국심사에서 나이를 말해야 하는데, 이 행성에서는 나이를 알파벳으로 말한다
     * a는 0, b는 1, c는 2, ..., j는 9임
     * 23살은 cd, 51살은 fb으로 표현한다
     * 나이 age가 매개변수로 주어질 때, 이 행성에 기반한 나이를 return하기
     */
    public String solution(int age) { // 23
        String answer = "";
        String alienAge = "abcdefghij";
        String[] ageArr = String.valueOf(age).split(""); // "2", "3"

        for(int i=0; i<ageArr.length; i++) {
            answer += alienAge.charAt(Integer.parseInt(ageArr[i]));
        }
        return answer;
    }

    public String solution2(int age) {
        StringBuilder sb = new StringBuilder();

        while(age > 0) {
            sb.insert(0, (char) ((age % 10) + (int) 'a'));
            age /= 10;
            System.out.println("sb : " + sb.toString());
        }
        return sb.toString();
    }

    public String solution3(int age) {
        return String.valueOf(age).chars().mapToObj(
                operand -> String.valueOf((char) (49 + operand)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        AlienAge alia = new AlienAge();
        System.out.println(alia.solution(27));
        System.out.println(alia.solution2(27));
    }
}
