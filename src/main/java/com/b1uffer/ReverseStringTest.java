package com.b1uffer;

public class ReverseStringTest {
    /**
     * for 루프를 사용해서 문자열 뒤집는 법
     */
    public void test1() {
        String s1 = "java is my life";
        String s2 = "";

        System.out.println("s1.length() = " + s1.length());

        for(int i = s1.length() - 1; i >= 0; i--) { // i는 s1의 길이 -1부터 시작. i가 0이 될때까지
            s2 = s2 + s1.charAt(i); // String에서 특정 위치의 문자열을 특정하는 charAt 메서드
            System.out.println("s2 : " + s2);
        }

        System.out.println("reversed String of the " + s1 + " is " + s2);
        System.out.println(s2);
    }

    /**
     * StringBuilder를 활용하여 문자열 뒤집기
     */
    public void test2() {
        StringBuilder s1 = new StringBuilder("스프링");
        System.out.println("s1 = " + s1);
        StringBuilder s2 = new StringBuilder("프레임워크");
        System.out.println("s2 = " + s2);
        StringBuilder s3 = new StringBuilder("라이브러리");
        System.out.println("s3 = " + s3);

        System.out.println("reversed String of the " + s1 + " is " + s1.reverse());
        System.out.println("reversed String of the " + s2 + " is " + s2.reverse());
        System.out.println("reversed String of the " + s3 + " is " + s3.reverse());
    }

    /**
     * 재귀를 활용하여 문자열 뒤집기
     */
    public String ReverseStringTest(String str) {
        if(str.isEmpty()) {
            System.out.println("String is empty");
            return str;
        } else {
            return ReverseStringTest(str.substring(1)) + str.charAt(0);
        }
    }

    /**
     * 재귀를 사용하여 문자열을 뒤집는 또다른 방법
     */
    public static String reverseString(String str) {
        if(str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    /**
     * 배열을 사용하여 문자열을 뒤집기
     */
    public String test3(String str) {
        if(str == null || str.equals("")) {
            return str;
        }

        int length = str.length();
        char[] newArr = new char[length];

        for(int i = 0; i < length; i++) {
            newArr[length - i - 1] = str.charAt(i);
        }
        return String.valueOf(newArr);
    }

    /**
     * Stream을 사용해서 문자열 뒤집기
     */
    public String test4(String str) {
        return str.chars() // 문자열을 int 스트림으로 변환하기, chars()이긴한데 유니코드 값으로 나온다
                .mapToObj(c -> (char)c) // int를 char형으로 다시 변환함
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .reverse()
                .toString();
    }

    public static void main(String[] args) {
        ReverseStringTest test1 = new ReverseStringTest();
//        test1.test2();

        String str1 = test1.ReverseStringTest("Java is fun");
        System.out.println(str1);

        String str2 = "Java";

        System.out.println(reverseString(str2));
        System.out.println(test1.test3(str2));
    }
}
