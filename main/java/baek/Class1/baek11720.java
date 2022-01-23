package baek.Class1;

import java.util.Scanner;

public class baek11720 {
    // baek 11720 : https://www.acmicpc.net/problem/11720
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String num  = sc.nextLine();

        int result = 0;
        for(int i = 0; i < num.length(); i++) {
            result += Character.getNumericValue(num.charAt(i));
        }

        System.out.println(result);
    }
}
