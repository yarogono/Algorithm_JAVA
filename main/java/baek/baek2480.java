package baek;

import java.util.Scanner;

public class baek2480 {
    // baek 2480 : https://www.acmicpc.net/problem/2480
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputStrArr = sc.nextLine().split(" ");

        CalcDice calcDice = new CalcDice();

        int result = calcDice.calcMethod(inputStrArr);

        System.out.println(result);
    }
}

class CalcDice {

    public int calcMethod(String[] inputStrArr) {
        int result = 0;

        int[] intArr = strArrayToIntArray(inputStrArr);

        for(int i = 0; i < intArr.length; i++) {

            int sameNum = 0;
            int tempNum = intArr[i];
            int maxNum = 0;
            for(int j = 0; j < intArr.length; j++) {
                int jNum = intArr[j];

                if(maxNum < jNum)
                    maxNum = jNum;

                if(tempNum == jNum)
                    sameNum++;
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
        return result;
    }


    private int[] strArrayToIntArray(String[] inputStrArr) {
        int strArrLength = inputStrArr.length;

        int[] intArr = new int[strArrLength];

        for(int i = 0; i < strArrLength; i++) {
            intArr[i] = Integer.parseInt(inputStrArr[i]);
        }

        return intArr;
    }
}