package 이코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Greedy03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");


        ArrayList<String> arrList = new ArrayList();
        for(int i = 0; i < Integer.parseInt(firstLine[0]); i++) {
            arrList.add(br.readLine());
        }

        ArrayList resultArr = new ArrayList();
        for(int i = 0; i < arrList.size(); i++) {
            int minNum = 9999;
            String[] tempStrArr =  arrList.get(i).split(" ");
            for(int j = 0; j < tempStrArr.length; j++) {
                int tempNum = Integer.parseInt(tempStrArr[j]);
                if(tempNum < minNum) {
                    minNum = tempNum;
                }
            }
            resultArr.add(minNum);
        }

        System.out.println(Collections.max(resultArr));
    }
}
