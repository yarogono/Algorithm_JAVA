import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek2475 {
    // baek 2475 : https://www.acmicpc.net/problem/2475
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStrArr = br.readLine().split(" ");
        int[] numArr = Arrays.stream(inputStrArr).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
             sum += numArr[i] * numArr[i];
        }
        System.out.println(sum % 10);
    }
}
