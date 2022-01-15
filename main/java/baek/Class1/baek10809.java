package baek.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baek10809 {
    // baek 10809 : https://www.acmicpc.net/problem/10809
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] result = new int[26];
        Arrays.fill(result, -1);

        // 아스키코드 97 ~ 122
        for(int i = 0; i < s.length(); i++) {
            int resultIndex = 0;
            for(int j = 97; j <= 122; j++) {
                if(j == (int)s.charAt(i) && result[resultIndex] == -1) {
                    result[resultIndex] = i;
                    break;
                }
                resultIndex++;
            }
        }

        for(int temp : result) {
            System.out.println(temp);
        }
    }
}
