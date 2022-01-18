package baek.Class1;

import java.io.IOException;
import java.util.Scanner;

public class baek10951 {
    // baek 10951 : https://www.acmicpc.net/problem/10951
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
        sc.close();
    }
}
