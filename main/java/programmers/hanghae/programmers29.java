package programmers.hanghae;

public class programmers29 {
    // 프로그래머스 3진법 뒤집기 => https://programmers.co.kr/learn/courses/30/lessons/68935
    public int solution(int n) {
        // 입력: 자연수 n이 매개변수로 주어집니다.
        int answer = 0;
        StringBuffer sb = new StringBuffer();
        // 처리1: n을 3진법 변경, 3진법을 앞뒤로 뒤집기

        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        // 처리2: 뒤집은 값을 10진법으로 변환 후 answer 변수에 할당
        answer = Integer.parseInt(sb.toString(), 3);
        return answer;
    }
}
