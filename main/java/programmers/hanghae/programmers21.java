package programmers.hanghae;

public class programmers21 {
    // 프로그래머스 이상한 문자 만들기 => https://programmers.co.kr/learn/courses/30/lessons/12930
    public String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer();

        String[] arrStr = s.split("");

        int idx = 0;
        for(int i = 0; i< arrStr.length; i++) {
            if(arrStr[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                arrStr[i] = arrStr[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                arrStr[i] = arrStr[i].toLowerCase();
                idx++;
            }
            sb.append(arrStr[i]);
        }

        answer = sb.toString();
        return answer;
    }
}
