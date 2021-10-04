import java.util.Scanner;

public class baek2292 {
    public static void main(String[] args) {
        int cnt = 1, numsPileup = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > numsPileup) {
            numsPileup += 6 * cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
}
