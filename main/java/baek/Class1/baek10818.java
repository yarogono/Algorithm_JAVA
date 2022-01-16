package baek.Class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class baek10818 {
    // baek 10818 : https://www.acmicpc.net/problem/10818
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            resultList.add(sc.nextInt());
        }
        System.out.println(Collections.min(resultList) + " " + Collections.max(resultList));
    }
}
