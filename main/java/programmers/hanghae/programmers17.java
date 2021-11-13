package programmers.hanghae;

public class programmers17 {
    // 프로그래머스 문자열 다루기 기본 => https://programmers.co.kr/learn/courses/30/lessons/12918
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() != 4) {
            answer = false;
            return answer;
        }

        for(int i = 0; i < s.length(); i++) {
            char tempChar = s.charAt(i);
            if(Character.getNumericValue(tempChar) > 9) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
