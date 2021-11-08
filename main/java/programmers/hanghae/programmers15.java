package programmers.hanghae;

public class programmers15 {
    // 프로그래머스 내적 => https://programmers.co.kr/learn/courses/30/lessons/70128
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;

        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        answer = sum;
        return answer;
    }
}
