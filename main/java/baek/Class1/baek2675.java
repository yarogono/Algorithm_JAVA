package baek.Class1;

import java.util.Scanner;

public class baek2675 {
    // baek 2675 : https://www.acmicpc.net/problem/2675
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String tempStr = sc.nextLine().trim();
            for(int j = 0; j < tempStr.length(); j++) {
                for(int k = 0; k < r; k++) {
                    sb.append(tempStr.charAt(j));
                }
            }
            System.out.println(sb);
            sb.delete(0, sb.length());
        }
    }
}
