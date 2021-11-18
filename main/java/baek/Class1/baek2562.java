package baek.Class1;

import java.util.Scanner;

public class baek2562 {
    // baek 2562 : https://www.acmicpc.net/problem/2562
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxNum = 0;
        int maxNumLength = 0;
        for(int i = 0; i < 9; i++) {
            int inputNum = sc.nextInt();
            if(inputNum > maxNum) {
                maxNum = inputNum;
                maxNumLength = i + 1;
            }
        }

        System.out.printf("%d%n%d", maxNum, maxNumLength);
    }
}
