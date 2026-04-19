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

    public static void main(String[] args) {
        ReverseStringTest test1 = new ReverseStringTest();
        test1.test2();

        System.out.println();
    }
}
