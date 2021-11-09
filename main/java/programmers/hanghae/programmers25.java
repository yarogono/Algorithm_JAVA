package programmers.hanghae;

public class programmers25 {
    // 프로그래머스 정수 제곱근 판별 만들기 => https://programmers.co.kr/learn/courses/30/lessons/12934
    public long solution(long n) {
        long answer = 0;
        double d = Math.sqrt(n);

        if(d - (int)d > 0) {
            answer = - 1;
            System.out.println(answer);
            return answer;
        }
        answer = (long)(Math.pow(d + 1, 2));

        return answer;
    }
}
