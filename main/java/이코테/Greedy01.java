// 그리디 알고리즘이란? => https://ko.wikipedia.org/wiki/%ED%83%90%EC%9A%95_%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
// 이코테 책 87 ~ 91p
package 이코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int coin: coinTypes) {
            count += n / coin;
            n %= coin;
        }
        System.out.println(count);
    }
}
