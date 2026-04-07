package com.b1uffer;

public class IceCoffee {
    /**
     * 추운날에도 아이스 아메리카노만 마시는 이상한놈
     * 아이스 아메리카노는 한잔에 5,500원
     * 가진 돈 money가 매개변수로 주어질 때,
     * 최대로 마실 수 있는 아메리카노의 잔 수와 남은 돈을 순서대로 담은 배열을 return하기
     */
    public int[] solution(int money) {
        int[] answer = new int[2]; // {아메리카노의 잔 수, 남은 돈}
        int coffee = 5500;
        int count = money / coffee;
        int price = coffee * count;
        if(count == 0) {
            answer[0] = count;
            answer[1] = money;
        } else if(count >= 1) {
            answer[0] = count;
            answer[1] = money - price;
        }
        return answer;
    }

    public int[] solution2(int money) {
        return new int[] {money / 5500, money % 5500};
    }
}
