package programmers.hanghae;

import java.util.ArrayList;

public class programmers26 {
    // 프로그래머스 제일 작은 수 제거하기 => https://programmers.co.kr/learn/courses/30/lessons/12935
    public int[] solution(int[] arr) {

        int[] answer = { - 1};

        if(arr.length == 1) {
            return answer;
        }

        int minNum = 999999;
        for(int i = 0; i < arr.length; i++) {
            int tempNum = arr[i];
            if(minNum >arr[i]) {
                minNum = tempNum;
            }
        }

        ArrayList<Integer> sb = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != minNum) {
                sb.add(arr[i]);
            }
        }
        answer = new int[sb.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = sb.get(i);
        }

        return answer;
    }
}
