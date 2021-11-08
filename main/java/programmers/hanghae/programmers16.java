package programmers.hanghae;

public class programmers16 {
    // 프로그래머스 문자열 내 p와 y의 개수 => https://programmers.co.kr/learn/courses/30/lessons/12916
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();

        int countP = 0;
        int countY = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') {
                countP++;
            } else if (s.charAt(i) == 'y') {
                countY++;
            }
        }

        if(countP == countY) {
            answer = true;
        } else if(countP != countY) {
            answer = false;
        }

        return answer;
    }
}
