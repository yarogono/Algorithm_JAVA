package programmers.hanghae;

import java.util.ArrayList;
import java.util.Collections;

public class programmers36 {
    // 프로그래머스 문자열 내림차순으로 배치하기 => https://programmers.co.kr/learn/courses/30/lessons/12917
    public String solution(String s) {
        // 입력: 문자열 s는 영문 대소문자로 구성되어 있다.
        // 목표: 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴
        String answer = "";

        // 입력된 문자열 s 를 각 char로 나눠서 listChar에 추가
        ArrayList<Character> listChar = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
          listChar.add(s.charAt(i));
        }

        // 내림차순으로 정렬 진행 => 아스키코드 순서 ( A ~ z)
        Collections.sort(listChar, Collections.reverseOrder());

        // 정렬을 완료한 listChar에 요소들을 StringBuffer에 append 해준다.
        // * answer에 그대로 넣어도 되지만 메모리 낭비를 막기위해 StringBuffer 사용
        StringBuffer sb = new StringBuffer();
        for (char c : listChar) {
            sb.append(c);
        }

        answer = sb.toString();


        return answer;
    }

    // 테스트용 메인 메서드
    public static void main(String[] args) {
        programmers36 test = new programmers36();
        String s = "Zbcdefg";
        test.solution(s);
    }
}
