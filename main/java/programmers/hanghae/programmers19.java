package programmers.hanghae;

public class programmers19 {
    // 프로그래머스 수박수박수박수박수박수? => https://programmers.co.kr/learn/courses/30/lessons/12922
    public String solution(int n) {
        String answer = "";
        String su = "수";
        String bak = "박";

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            if( i % 2 == 1) {
                sb.append(bak);
            } else {
                sb.append(su);

            }
        }

        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        int n = 0;
        programmers19 test = new programmers19();
        test.solution(n);
    }
}