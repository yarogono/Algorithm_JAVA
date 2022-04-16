package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2869 {
    // baek 2869 : https://www.acmicpc.net/problem/2869
    // 참고한 링크 => https://st-lab.tistory.com/75
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrArr = br.readLine().split(" ");

        int A = Integer.parseInt(inputStrArr[0]);
        int B = Integer.parseInt(inputStrArr[1]);
        int V = Integer.parseInt(inputStrArr[2]);

        int day = (V - B) / (A - B);

        // 나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if ((V - B) % (A - B) != 0) {
            day++;
        }

        System.out.println(day);
    }
}