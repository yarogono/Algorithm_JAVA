package programmers.hanghae;

public class programmers03 {
    // 프로그래머스 가운데 글자 가져오기 => https://programmers.co.kr/learn/courses/30/lessons/12903
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0) {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            answer = String.valueOf(s.charAt(s.length() /2));
        }
        return answer;
    }
}
