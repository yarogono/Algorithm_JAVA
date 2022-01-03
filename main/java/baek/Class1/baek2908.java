package baek.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        int num = 0;

        StringBuffer sb = new StringBuffer();
        for(int j = 0; j < inputStr.length; j++) {
            for(int i = 2; i >= 0; i--) {
                sb.append(inputStr[j].charAt(i));
            }

            int tempInt = Integer.parseInt(sb.toString());
            if(tempInt > num) {
                num = tempInt;
            }
            sb.delete(0, sb.length());
        }
        System.out.println(num);
    }
}
