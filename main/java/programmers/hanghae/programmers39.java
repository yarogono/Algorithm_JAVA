package programmers.hanghae;

import java.util.ArrayList;

public class programmers39 {
    // 프로그래머스 시저 암호 => https://programmers.co.kr/learn/courses/30/lessons/12926
    public String solution(String s, int n) {
        String answer = "";
        // 65 ~ 90 (A ~ Z)
        // 97 ~ 121 (a ~ z)
        // 32 => 공백(space)
        ArrayList<Integer> listArr = new ArrayList();

        // 입력된 s 문자열을 문자 단위로 나눠서 listArr에 추가해준다.
        for(int i = 0; i < s.length(); i++) {
            listArr.add((int)s.charAt(i));
        }


        StringBuffer sb = new StringBuffer();
        // 각 문자들을 아스키코드를 참고해서 유효성 검사
        // 아스키코드 표를 보고 더했을 때 문제가 원하는 값이 나오게 한다.
        for (int tempNum: listArr) {
            for(int i = 0; i < n; i++) {
                if(tempNum == 122) {
                    tempNum = 97;
                } else if(tempNum == 90) {
                    tempNum = 65;
                } else if(65 <= tempNum  && tempNum <=90) {
                    tempNum++;
                } else if(97 <= tempNum && tempNum <= 121) {
                    tempNum++;
                }
            }
            sb.append((char)tempNum);
        }

        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        programmers39 test = new programmers39();
        String s = "z";
        int n = 1;
        test.solution(s, n);
    }
}
