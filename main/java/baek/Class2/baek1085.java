package baek.Class2;

import java.util.Scanner;

public class baek1085 {
    // baek 1085 : https://www.acmicpc.net/problem/1085
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 직사각형을 탈출하는 최소거리는 4가지 방법 중 하나
        // 위, 아래, 좌, 우 중 최솟값만 찾으면 되는 것

        // x, y 한수의 위치
        // w, h 목적지지
       int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        // x선 최단거리 구하기
        // 총 가로거리(w) - x의 거리 = 남은 x의 거리
        // y_min = x와 w-x 중 최소 거리
        int x_min = Math.min(x, w-x);

        // 총 세로거리(y) - y의 거리 = 남은 y의 거리
        // y_min = y와 h-y 중 최소 거리
        int y_min = Math.min(y, h-y);

        // x_min과 y_min 중 최단 거리
        System.out.println(Math.min(x_min, y_min));
    }
}
