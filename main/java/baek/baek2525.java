package baek;

import java.util.Scanner;

public class baek2525 {
    // baek 2525 : https://www.acmicpc.net/problem/2525
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentTime = sc.nextLine();
        int endTime = sc.nextInt();

        String[] arrStr = currentTime.split(" ");

        int hour = Integer.parseInt(arrStr[0]);
        int minute = Integer.parseInt(arrStr[1]);

        minute += endTime;

        if(minute >= 60) {
            int hourNum = minute / 60;
            minute %= 60;
            hour += hourNum;

            if(hour >= 24) {
                hour -= 24;
            }
        }

        System.out.printf("%d %d", hour, minute);
    }
}
