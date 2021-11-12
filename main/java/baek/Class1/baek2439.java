package baek.Class1;

import java.util.Scanner;

public class baek2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        for(int i = 0; i < inputNum; i++) {
            for (int j = inputNum; j > i + 1; j--) {
                System.out.printf(" ");

            }
            for(int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
