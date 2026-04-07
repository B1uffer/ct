package com.b1uffer;

public class Saleoff {
    public int solution(int price) {
        /**
         * 10만원 이상 사면 5%, 30만원 이상 사면 10%, 50만원 이상 사면 20% 할인해줌
         * 구매한 옷 가격 price가 주어질 때, 지불해야할 금액을 return하기
         */
        int answer = 0;

        if(price >= 100000 && price < 300000) {
            price =(int)(price * (1 - 0.05));
        } else if(price >= 300000 && price < 500000) {
            price = (int) (price * (1 - 0.1));
        } else if(price >= 500000) {
            price = (int) (price * (1 - 0.2));
        }

        answer = price;

        return answer;
    }
}
