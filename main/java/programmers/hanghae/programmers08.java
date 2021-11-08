package programmers.hanghae;

import java.util.Arrays;

public class programmers08 {
    // 프로그래머스 평균 구하기 => https://programmers.co.kr/learn/courses/30/lessons/12944
    public double solution(int[] arr) {
        double answer = 0;
        answer = (double) Arrays.stream(arr).sum() / arr.length;
        return answer;
    }
}
