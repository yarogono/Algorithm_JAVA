package programmers.hanghae;

import java.util.ArrayList;
import java.util.Comparator;

public class programmers24 {
    // 프로그래머스 정수 내림차순으로 배치하기 => https://programmers.co.kr/learn/courses/30/lessons/12933
    public long solution(long n) {
        long answer = 0;
        String tempStr = String.valueOf(n);
        ArrayList<Integer> tempArr = new ArrayList<Integer>();

        for(int i = 0; i < tempStr.length(); i++) {
            tempArr.add(Character.getNumericValue(tempStr.charAt(i)));
        }

        tempArr.sort(Comparator.reverseOrder());
        StringBuffer sb = new StringBuffer();

        for (int temp: tempArr) {
            sb.append(temp);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
