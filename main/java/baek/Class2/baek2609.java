package baek.Class2;

import java.util.Scanner;

public class baek2609 {
    // baek 2609 : https://www.acmicpc.net/problem/2609
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int gcdNum = getGcdNum(n ,m);

        // 최소공배수 = 두 자연수의 곱 / 최대공약수
        int lcmNum = (n * m) / gcdNum;

        System.out.printf("%d\n%d", gcdNum, lcmNum);
    }

    // 유클리드 호제법을 사용한 최대공약수 구하는 메서드
    private static int getGcdNum(int n, int m) {

        while(m != 0) {
            int tempNum = m;
            m = n % m;
            n = tempNum;
        }
        return n + m;
    }
}
