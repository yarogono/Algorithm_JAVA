package baek.Class1;

import java.util.Scanner;

public class baek2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[8];
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }
        sc.close();

        String result = "";
        for(int i = 0; i < numArr.length - 1; i++) {
            if(numArr[i] == numArr[i + 1] - 1) {
                result = "ascending";
            } else if(numArr[i] == numArr[i + 1] + 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        System.out.println(result);
    }
}
