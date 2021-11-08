package programmers.hanghae;

public class programmers18 {
    // 프로그래머스 서울에서 김서방 찾기 => https://programmers.co.kr/learn/courses/30/lessons/12919
    public String solution(String[] seoul) {
        String answer = "";
        int locationNum = 0;

        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                locationNum = i;
            }
        }

        answer = "김서방은 " + locationNum +"에 있다.";
        return answer;
    }
}
