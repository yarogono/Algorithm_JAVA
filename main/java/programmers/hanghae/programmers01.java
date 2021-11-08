package programmers.hanghae;
import java.util.Scanner;

public class programmers01 {
    // 프로그래머스 직사각형 별 찍기 => https://programmers.co.kr/learn/courses/30/lessons/12969
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
