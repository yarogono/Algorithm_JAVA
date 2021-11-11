package programmers.hanghae;

import java.util.ArrayList;
import java.util.Collections;

public class programmers35 {
    // 프로그래머스 문자열 내 마음대로 정렬하기 => https://programmers.co.kr/learn/courses/30/lessons/12915
    public String[] solution(String[] strings, int n) {
        // 입력: 문자열로 구성된 리스트 strings 와 정수 n
        String[] answer = {};

        // String 형식의 값을 추개헛 정렬 해주기 위해서 ArrayList 사용
        ArrayList<String> list = new ArrayList();

        // 각 문자열의 n 번째 있는 값과 문자열을 같이 list에 추가 해준다.
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        // list를 오름차순으로 정렬한다.
        Collections.sort(list);

        // answer 배열을 list.size() 크기만큼 초기화 해준다.
        answer = new String[list.size()];

        // answer 배열의 각 요소에 list의 n번째 케릭터 + 문자열(strings[i])을 분리해 할당해준다.
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }

        return answer;
    }

    public static void main(String[] args) {
        programmers35 test = new programmers35();
        String[] strings = { "abce", "abcd", "cdx" };
        int n = 2;
        test.solution(strings, n);
    }
}
