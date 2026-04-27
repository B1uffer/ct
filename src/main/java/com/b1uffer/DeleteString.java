package com.b1uffer;

public class DeleteString {
    /**
     * 특정 문자 my_string과 문자 letter이 매개변수
     * my_string에서 letter를 제거한 문자열을 return하기
     */
    public String solution(String my_string, String letter) {
        String answer = "";

        StringBuilder builder = new StringBuilder();

        String c = builder.append(letter).toString();
        System.out.println("c : " + c);

        String a = my_string.replace(letter, "");
        String b = letter.replace(letter, "bc");
        System.out.println("b : " + b);


//        String copy = my_string;
//        char a, b;
//
//        for(int i = 0; i < letter.length(); i++) {
//            a = letter.charAt(i); // f
//            System.out.println("letter : " + a);
//            for(int j = 0; j < my_string.length(); j++) {
//                b = my_string.charAt(j); // f
//                System.out.println("my_string : " + b);
//                if(a == b) {
//                    copy = my_string.replace(my_string, my_string + a);
//                }
//            }
//        }
//        answer = copy;
        return a;
    }
}
