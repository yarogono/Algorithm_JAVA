package baek.Class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baek1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjects = sc.nextInt();
        ArrayList<Float> scores = new ArrayList();

        for(int i = 0; i < subjects; i++) {
            scores.add(sc.nextFloat());
        }

        float maxScore = Collections.max(scores);
        float sumNum = 0;
        for(int i = 0; i < scores.size(); i++) {
            float fixScore = scores.get(i) / maxScore * 100.0f;
            sumNum += fixScore;
        }

        System.out.println(sumNum / scores.size());
    }
}
