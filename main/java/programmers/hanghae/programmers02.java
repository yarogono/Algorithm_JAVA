package programmers.hanghae;

public class programmers02 {
    // 프로그래머스 짝수와 홀수 => https://programmers.co.kr/learn/courses/30/lessons/12937
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0 || num == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}
