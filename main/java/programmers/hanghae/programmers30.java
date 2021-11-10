package programmers.hanghae;

import java.util.Arrays;

public class programmers30 {
    // 프로그래머스 최소직사각형 => https://programmers.co.kr/learn/courses/30/lessons/86491
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;

        // * 세로가 가로보다 긴 명함을 가로로 눕혀주는 반복문
        // 모든 명함이 각각 가로가 길고 세로가 짧아야 가로에서 최댓값 세로에서 최댓값을 구할 수 있다.
        for(int i = 0; i < sizes.length; i++) {
            for(int j = 0; j < sizes[i].length / 2; j++) {
                if(sizes[i][j] < sizes[i][j + 1]) {
                    int tempNum = sizes[i][j];
                    sizes[i][j] = sizes[i][j + 1];
                    sizes[i][j + 1] = tempNum;
                }
            }
        }

        // 가로, 세로 최댓값을 만족하는 값을 maxWith, maxHeight에 각각 할당한다.
        for(int i = 0; i < sizes.length; i++) {
            for(int j = 0; j < sizes[i].length / 2; j++) {
                if(sizes[i][j] > maxWidth) {
                    maxWidth = sizes[i][j];
                }

                if(sizes[i][j + 1] >maxHeight) {
                    maxHeight = sizes[i][j + 1];
                }
            }
        }

        // maxWidth 와 maxHeight 를 곱해서 넓이를 구해서 answer 변수에 할당한다.
        answer = maxWidth * maxHeight;
        return answer;
    }

    // 테스트를 위해 만든 메인함수
    public static void main(String[] args) {
        programmers30 test = new programmers30();
        int[][] sizes = {{ 14, 4 }, { 19, 6}, { 6, 16 }, { 18, 7 }, { 7, 11 }};
        test.solution(sizes);
    }
}
