package com.b1uffer;

import java.util.HashMap;
import java.util.Map;

public class Mode {
    public int solution(int[] array) {
        int solution = 0;
        // 최빈값은 주어진 값 중에서 가장 자주 나오는 값

        // 맵 만듬
        Map<Integer, Integer> map = new HashMap<>();

        // 여기에서 Map에 Key - Value 형태로 값을 넣는데, Value를 카운트할거임
        for(int i=0; i<array.length; i++) {
            if(map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        int max = 0;

        // 최빈값 찾기, value중에 가장 큰 값
        for(int key : map.keySet()) { // keyset()을 통해 map에서 key를 뽑아 이에 대해 향상된 for문을 돌림
            int count = map.get(key); // key값에 맞는 value를 가져옴

            if(count > max) { // max보다 count가 더 크다면
                max = count; // max에 count를 넣음
                solution = key;
            } else if(count == max) {
                solution = -1;
            }
        }
        System.out.println("solution : " + solution);
        return solution;
    }
}
