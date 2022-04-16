package baek;

import java.util.Scanner;

public class baek2480 {
    // baek 2480 : https://www.acmicpc.net/problem/2480
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputStrArr = sc.nextLine().split(" ");

        int result = 0;
        for(int i = 0; i < inputStrArr.length; i++) {

            int sameNum = 0;
            int tempNum = Integer.parseInt(inputStrArr[i]);
            int maxNum = 0;
            for(int j = 0; j < inputStrArr.length; j++) {
                int jNum = Integer.parseInt(inputStrArr[j]);
                if(maxNum < jNum) {
                    maxNum = jNum;
                }

                if(tempNum == jNum) {
                    sameNum++;
                }
            }

            if(sameNum == 3) {
                result = 10000 + tempNum * 1000;
                break;
            } else if(sameNum == 2) {
                result = 1000 + tempNum * 100;
                break;
            } else {
                result = maxNum * 100;
            }
        }

        System.out.println(result);
    }
}
