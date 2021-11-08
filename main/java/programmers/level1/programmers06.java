package programmers.level1;

import java.util.Arrays;

public class programmers06 {
    // 프로그래머스 없는 숫자 더하기 => https://programmers.co.kr/learn/courses/30/lessons/86051
    public int solution(int[] numbers) {
        int answer = -1;
        answer = 45 - Arrays.stream(numbers).sum();
        return answer;
    }
}
