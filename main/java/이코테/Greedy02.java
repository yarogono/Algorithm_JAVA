package 이코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greedy02 {
    public static void main(String[] args) throws IOException {
        // 1. 배열의 크기 n, 숫자가 더해지는 횟수 m
        // 2. 배열의 특정한 인덱스(번호)에 해당하는 수가 연속해서 k번을 더해질 수 없다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputNumArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = inputNumArr[0];
        int m = inputNumArr[1];
        int k = inputNumArr[2];

        Arrays.sort(data);

        int sumNum = 0;
        int count = 1;
        while(count <= m) {
            if(count % k == 0) {
                sumNum += data[n - 2];
            } else {
                sumNum += data[n - 1];
            }
            count++;
        }

        System.out.println(sumNum);
    }
}
