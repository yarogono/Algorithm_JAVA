package programmers.level1;

public class programmers07 {
    // 프로그래머스 음양 더하기 => https://programmers.co.kr/learn/courses/30/lessons/76501
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;

        int sumNum = 0;
        for(int i = 0; i < absolutes.length; i++) {
            if(!(signs[i])) {
                sumNum -= absolutes[i];
            } else {
                sumNum += absolutes[i];
            }
        }
        answer = sumNum;
        return answer;
    }
}
