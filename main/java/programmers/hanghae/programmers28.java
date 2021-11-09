package programmers.hanghae;

public class programmers28 {
    // 프로그래머스 하샤드 수 => https://programmers.co.kr/learn/courses/30/lessons/12935
    public boolean solution(int x) {
        boolean answer = true;
        String tempStr = String.valueOf(x);

        int sumNum = 0;
        for(int i = 0; i < tempStr.length(); i++) {
            sumNum += Character.getNumericValue(tempStr.charAt(i));
        }
        System.out.println(50 % 10);
        if(x % sumNum != 0) {
            answer = false;
        }

        return answer;
    }
}
