package programmers.hanghae;

import java.util.ArrayList;
import java.util.Collections;

public class programmers14 {
    // 프로그래머스 나누어 떨어지는 숫자 배열 => https://programmers.co.kr/learn/courses/30/lessons/12910
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrList = new ArrayList();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            }
        }

        if(!arrList.isEmpty()) {
            int[] answer = new int[arrList.size()];
            Collections.sort(arrList);
            for (int i = 0; i < arrList.size(); i++) {
                answer[i] = arrList.get(i);
            }
            return answer;
        }

        int[] answer = { -1 };

        return answer;
    }
}
