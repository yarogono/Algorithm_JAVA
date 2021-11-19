package baek.Class1;

import java.util.Scanner;

public class baek2577 {
    // baek 2577 : https://www.acmicpc.net/problem/2577
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumNum = 1;
        for(int i = 0; i < 3; i++) {
            sumNum *= sc.nextInt();
        }

        String tempStr = Integer.toString(sumNum);
        int[] resultArr = new int[10];

        for(int i = 0; i < tempStr.length(); i++) {
            resultArr[Character.getNumericValue(tempStr.charAt(i))]++ ;
        }

        for(int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
    }
}