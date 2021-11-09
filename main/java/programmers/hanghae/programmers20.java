package programmers.hanghae;

import java.util.Arrays;

public class programmers20 {
    // 프로그래머스 완주하지 못한 선수 => https://programmers.co.kr/learn/courses/30/lessons/42576
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        answer = participant[Arrays.mismatch(participant, completion)];
        return answer;
    }
}
