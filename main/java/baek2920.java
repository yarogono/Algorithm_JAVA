import java.io.IOException;
import java.util.Scanner;

public class baek2920 {
    // baek 1193 : https://www.acmicpc.net/problem/2920
    public static void main(String[] args) throws IOException {
        // BufferReader로 사용해 볼려고 했지만 각 문자를 int형으로 바꿔야 해서 문제 발생
        // Scanner를 사용해서 각 정수를 배열에 입력 받는 방법
        // Scanner는 공백(띄어쓰기) 또는 개행(줄 바꿈)을 기준으로 읽는다.
        Scanner sc = new Scanner(System.in);
        int[] inputArr = new int[8];
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }
        // Scanner 클래스를 사용 후 close()
        sc.close();

        String output = "";
        for (int i = 0; i < inputArr.length - 1; i++) {
            // inputArr의 i 번째와 i + 1 번째에  - 1 을 해서 같으면 ascending
            if (inputArr[i] == inputArr[i + 1] - 1) {
                output = "ascending";

            // inputArr의 i 번째와 i + 1 번째에  + 1 을 해서 같으면 descending
            } else if (inputArr[i] == inputArr[i + 1] + 1) {
                output = "descending";
            } else {
                output = "mixed";
                break;
            }
        }
        System.out.println(output);
    }
}
