package baek.Class1;

import java.util.Scanner;

public class baek10952 {
    // baek 10952 : https://www.acmicpc.net/problem/10952
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a != 0 && b != 0)
                System.out.println(a + b);
        }
        sc.close();
    }
}