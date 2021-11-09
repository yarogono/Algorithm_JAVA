package programmers.hanghae;

public class programmers27 {
    // 프로그래머스 콜라츠 추측 => https://programmers.co.kr/learn/courses/30/lessons/12943
    public int solution(int num) {
        int answer = 0, count = 0;
        long longNum = num;

        for(int i = 0; i < 500; i++) {
            if(longNum == 1) break;

            if(longNum % 2 == 0) {
                longNum /= 2;
            } else {
                longNum = longNum * 3 + 1;
            }
            count++;
        }

        if(count == 500) {
            answer = -1;
            return answer;
        }

        answer = count;

        return answer;
    }
}
