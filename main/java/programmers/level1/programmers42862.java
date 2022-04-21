package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class programmers42862 {
    // 프로그래머스 체육복 => https://programmers.co.kr/learn/courses/30/lessons/42862
    public static void main(String[] args) {
        int n = 5;
        int[] lost = new int[]{2, 4};
        int[] reserve = new int[]{1, 3, 5};

        System.out.println(solution(n, lost, reserve));


    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        return answer;
    }


    @Test
    public void 정답() {
        assertEquals(5, solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        assertEquals(4, solution(5, new int[]{2, 4}, new int[]{3}));
        assertEquals(2, solution(3, new int[]{3}, new int[]{1}));
    }
}


