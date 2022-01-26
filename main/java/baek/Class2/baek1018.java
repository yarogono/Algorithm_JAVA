package baek.Class2;

import java.util.Scanner;

public class baek1018 {
    // baek 1018 : https://www.acmicpc.net/problem/1018
    // 풀이 참고한 블로그 => https://st-lab.tistory.com/101
    public static  boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 체스판 세로 줄의 갯수
        int n = sc.nextInt();
        // 체스판 가로 줄의 갯수
        int m = sc.nextInt();

        // 체스판 칸이 검은색인지 흰색인지 boolean 배열로 표시
        arr = new boolean[n][m];

        // 체스판 각 칸이 무엇으로 칠해져 있는지 입력
        // - W 일때는 true
        // - B일 때는 false
        for(int i = 0; i < n; i++) {
            // 세로 줄에 해당하는 각 라인 입력
            String chessLine = sc.next();
            // 각 라인의 칸 W인지 B 인지 확인
            for(int j = 0; j < m; j++) {
                if (chessLine.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        // 경우의수는 (가로 칸 개수 - 7) x (세로 칸 개수 - 7)
        int N_row = n - 7;
        int M_col = m - 7;

        // 8 X 8 크기의 배열을 하나씩 검사
        // - 첫 칸의 색이 하얀색일 경우와 검은색일 경우의 수를 비교하여 칠한 개수 최솟값 구하기
        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    // 다시 칠해야 하는 정사각형 개수 최솟값 찾는 함수
    private static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        // 첫 번째 칸의 색
        boolean TF = arr[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {

                // 올바른 색이 아닐경우 count 1 증가
                if (arr[i][j] != TF) {
                    count++;
                }

                /*
                 * 다음 칸은 색이 바뀌므로
                 * true라면 false로, false 라면 true 로
                 * 값을 변경한다.
                 */
                TF = (!TF);
            }

            TF = !TF;
        }
        /*
         *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
         *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
         *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장
         */
        count = Math.min(count, 64 - count);

        /*
         * 이전까지의 경우 중 최솟값보다 현재 count 값이
         * 더 작을 경우 최솟값을 갱신
         */
        min = Math.min(min, count);
    }
}
