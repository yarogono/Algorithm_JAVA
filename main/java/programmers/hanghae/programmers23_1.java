package programmers.hanghae;

import java.util.Arrays;

public class programmers23_1 {
    // 프로그래머스 자연수 뒤집어 배열로 만들기 => https://programmers.co.kr/learn/courses/30/lessons/12932
    // 25번 같은 문제의 소스이지만 StringBuffer를 사용해서 새로 풀어볼 예정
    public int[] solution(long n) {
        String inputStr = String.valueOf(n);
        int[] answer = new int[inputStr.length()];
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < inputStr.length(); i++) {
            sb.append(inputStr.charAt(i));
        }

        sb.reverse();

        for(int i = 0; i < sb.length(); i++) {
            answer[i] = Character.getNumericValue(sb.charAt(i));
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
