package baek.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine().trim();

        System.out.println(inputStr == "" ? 0 : inputStr.split(" ").length);
    }
}
