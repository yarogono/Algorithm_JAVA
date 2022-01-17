package baek.Class1;

import java.util.Scanner;

public class baek10871 {
    // baek 10871 : https://www.acmicpc.net/problem/10871
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");

        for(int i = 0; i < b.length; i++) {
            if(Integer.parseInt(a[1]) > Integer.parseInt(b[i])) {
                System.out.println(b[i]);
            }
        }

    }
}
