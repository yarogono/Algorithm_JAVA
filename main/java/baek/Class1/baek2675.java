package baek.Class1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baek2675 {
    // baek 2675 : https://www.acmicpc.net/problem/2675
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        List<String> resultList = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String tempStr = sc.nextLine().trim();
            for(int j = 0; j < tempStr.length(); j++) {
                for(int k = 0; k < r; k++) {
                    sb.append(tempStr.charAt(j));
                }
            }

            resultList.add(sb.toString());
            sb.delete(0, sb.length());
        }

        for (String tempStr : resultList) {
            System.out.println(tempStr);
        }
    }
}
