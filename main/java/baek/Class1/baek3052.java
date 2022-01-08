package baek.Class1;

import java.util.HashSet;
import java.util.Scanner;

public class baek3052 {
    // baek 3052 : https://www.acmicpc.net/problem/3052
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet();


        for (int i = 0; i < 10; i++) {
            int tempNum = sc.nextInt();
            hashSet.add(tempNum % 42);
        }
        System.out.println(hashSet.size());
    }
}
