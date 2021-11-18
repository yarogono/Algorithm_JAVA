package 이코테;

import java.util.Scanner;

public class Greedy04 {
    public static void main(String[] args) {
        // 입력: n => 첫번째 값, k => 두번째 값
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // resultCount => n을 1이 될 때까지 몇번 나누었는지 횟수 세기 위해 있는 변수
        int resultCount = 0;

        // while 반복문을 사용해 n이 1이 아니면 반복문이 실행 되도록 구현
        while(n != 1) {

            // 1. n이 k로 나누어 떨어지면
            // 2. n을 k 로 나눈 값을 n에 할당 해준다.
            // 3. resultCount의 값을 +1 해준다.
            if(n % k == 0) {
                n /= k;
                resultCount++;
            } else {
                // n이 k로 나누어 떨어지지 않으면 -1 해준다.
                n--;
            }
        }

        System.out.println(resultCount);
    }
}
