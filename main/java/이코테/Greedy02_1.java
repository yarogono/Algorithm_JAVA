package 이코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greedy02_1 {
    public static void main(String[] args) throws IOException {
        // N, M, K를 공백으로 구분하여 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputNumArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = inputNumArr[0];
        int m = inputNumArr[1];
        int k = inputNumArr[2];

        // 입력 받은 수 정렬
        Arrays.sort(data);
        int first = data[n - 1];
        int second = data[n - 2];
        
        // 가장 큰 수가 더해지는 횟수 계산
        int count = m / (k + 1) * k;
        count += m % (k + 1);

        int result = 0;
        result += (count) * first;      //가장 큰 수 더하기
        result += (m - count) * second; // 두 번째로 큰 수 더하기

        System.out.println(result);

    }
}
