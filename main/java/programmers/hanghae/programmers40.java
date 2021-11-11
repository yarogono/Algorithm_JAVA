package programmers.hanghae;

public class programmers40 {
    // 프로그래머스 신규 아이디 추천 => https://programmers.co.kr/learn/courses/30/lessons/72410﻿
    public String solution(String new_id) {
        String answer = new_id.toLowerCase(); // 1단계

        answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2단계
        answer = answer.replaceAll("[.]{2,}", "."); // 3단계
        answer = answer.replaceAll("^[.]|[.]$", "");    // 4단계

        if (answer.equals("")) {    // 5단계
            answer += "a";
        }

        if (answer.length() >= 16) {     // 6단계
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");
        }

        if (answer.length() <= 2) {  // 7단계
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }

    // 테스트용 메인 메서드
    public static void main(String[] args) {
        programmers40 test = new programmers40();
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        test.solution(new_id);
    }
}
