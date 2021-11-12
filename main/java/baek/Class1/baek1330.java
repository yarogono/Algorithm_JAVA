package baek.Class1;

import java.util.Scanner;

public class baek1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(n > k) {
            System.out.println(">");
        } else if(n < k) {
            System.out.println("<");
        } else if(n == k) {
            System.out.println("==");
        }
    }
}
