import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1193 {
    // baek 1193 : https://www.acmicpc.net/problem/1193
    // reference link : https://st-lab.tistory.com/74
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt((br.readLine()));

        int crossCount = 1, prevCountSum = 0;

        while (true) {
            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (x <= prevCountSum + crossCount) {
                if (crossCount % 2 == 1) { // 대각선의 개수가 홀수라면
                    // 분모가 큰 수부터 시작
                    // 분모는 대각선 개수 - (X 번째 - 직전 대각선까지의 누적합 - 1)
                    // 분자는 X 번째 - 직전 대각선까지의 누적합
                    System.out.print((crossCount - (x - prevCountSum -1 )) + "/" + (x - prevCountSum));
                    break;
                }
                else { // 대각선의 개수가 짝수라면
                    // 홀수일 때의 출력을 반대로
                    System.out.println((x - prevCountSum) + "/" + (crossCount - (x - prevCountSum -1)));
                    break;
                }
            } else {
                prevCountSum += crossCount;
                crossCount++;
            }
        }
    }
}
