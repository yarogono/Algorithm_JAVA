package programmers.level1;

public class programmers04 {
    // 프로그래머스 두 정수 사이의 합 => https://programmers.co.kr/learn/courses/30/lessons/12912
    public long solution(int a, int b) {
        long answer = 0;
        int big, small;
        if ( a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        for(int i = 0; small <= big; i++) {
            answer += small;
            small++;
        }
        return answer;
    }
}
