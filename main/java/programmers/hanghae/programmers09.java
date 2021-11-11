package programmers.hanghae;

public class programmers09 {
    // 프로그래머스 핸드폰 번호 가리기 => https://programmers.co.kr/learn/courses/30/lessons/12948
    public String solution(String phone_number) {
        String answer = "";

        String backStr = phone_number.substring(phone_number.length()-4, phone_number.length());
        String frontStr = phone_number.substring(0, phone_number.length() - 4);

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < frontStr.length(); i++) {
            sb.append("*");
        }

        answer = sb + backStr;
        return answer;
    }
}
