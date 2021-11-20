package baek.Class2;

import java.util.Scanner;

public class baek1929 {
    // baek 1929 : https://www.acmicpc.net/problem/1929
    // https://st-lab.tistory.com/84 링크에 있는 코드를 보고 공부
    // 소수 구하는 알고리즘 및 구현 자세한 글 => https://st-lab.tistory.com/81

    // boolean타입 배열 선언;
    public static boolean[] primeNum;

    public static void main(String[] args) {
        // 입력 및 목표: M 이상 N 이하의 소수 모두 출력
        // (1 <= M <= N <= 1,000,000) M 이상 N 이하의 소수가 하나 이상 있는 입력만 주어진다.
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        // 소수 판별을 위한 0 부터 N까지의 bool타입 배열 초기화
        primeNum = new boolean[N + 1];

        // 소수 판별 로직을 수행하는 메서드
        get_prime();

        // 출력 할 소수가 많을 수 있어서 성능 개선을 위해 하나의 문자열로 연결 시켜서 출력
        // => StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        // 소수만 sb에 append => primeNum 배열에서 false만 소수
        for(int i = M; i <= N; i++ ) {
            if(!primeNum[i])
                sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    // 에라토스테네스의 체 알고리즘
    private static void get_prime() {
        // true = 소수X, false = 소수

        // 0과 1은 소수 X
        primeNum[0] = primeNum[1] = true;

        // https://st-lab.tistory.com/81 <- 링크 참고해서 공부
        for(int i = 2; i <= Math.sqrt(primeNum.length); i++) {
            if(primeNum[i]) continue;
            for(int j = i * i; j < primeNum.length; j += i ) {
                primeNum[j] = true;
            }
        }
    }
}