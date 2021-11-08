package programmers.hanghae;

public class programmers12 {
    // 프로그래머스 부족한 금액 계산하기 => https://programmers.co.kr/learn/courses/30/lessons/82612
    public long solution(int price, int money, int count) {
        long answer = -1;

        long totalPrice = 0;
        for (int i = 0; i < count; i++) {
            long deltaPrice= 0;
            deltaPrice = price * (i + 1);
            totalPrice += deltaPrice;
        }
        answer = money - totalPrice >= 0? 0 : totalPrice - money;

        return answer;
    }
}
