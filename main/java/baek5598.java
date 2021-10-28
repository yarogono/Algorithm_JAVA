import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek5598 {
    // baek 5598 : https://www.acmicpc.net/problem/5585
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 - Integer.parseInt(br.readLine());
        int[] coinTypes = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int coin: coinTypes) {
            count += n / coin;
            n %= coin;
        }

        System.out.println(count);
    }
}
