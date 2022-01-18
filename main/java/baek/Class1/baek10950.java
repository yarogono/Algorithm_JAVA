package baek.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek10950 {
    // baek 10950 : https://www.acmicpc.net/problem/10950
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt((br.readLine()));

        for(int i = 0; i < t; i++) {
            String[] tempStrArr = br.readLine().split(" ");
            System.out.println(Integer.parseInt(tempStrArr[0]) + Integer.parseInt(tempStrArr[1]));
        }
    }
}
