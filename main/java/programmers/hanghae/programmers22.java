package programmers.hanghae;

import java.util.stream.Stream;

public class programmers22 {
    // 프로그래머스 자릿수 더하기 => https://programmers.co.kr/learn/courses/30/lessons/12931
    public int solution(int n) {
        int answer = 0;

        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < digits.length; i++) {
            answer += digits[i];
        }
        return answer;
    }
}
