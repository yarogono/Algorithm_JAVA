package programmers.hanghae;

public class programmers13 {
    // 프로그래머스 윤년 => https://programmers.co.kr/learn/courses/30/lessons/12901
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};


        int[] mDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sumMonthDays = 0;
        for(int i = 0; i < a - 1; i++) {
            sumMonthDays += mDays[i];
        }

        sumMonthDays += b -1;

        answer = days[sumMonthDays % 7];

        return answer;
    }


    public static void main(String[] args) {
        programmers13 test = new programmers13();
        System.out.println(test.solution(5, 3));
    }
}
