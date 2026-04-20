package com.b1uffer;

import java.util.Scanner;

public class Triangle {
    /**
     * *의 높이와 너비를 1이라고 했을 때, *를 이용해 직각 이등변 삼각형을 그리기
     * 정수 n이 주어지면 높이와 너비가 n인 직각 이등변삼각형을 출력하기
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "";
        for(int i = 0; i < n; i++) {
            star += "*";
            System.out.println(star);
        }

        System.out.println(n);
    }
}
