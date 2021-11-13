package baek.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1157 {
    // baek 1157 : https://www.acmicpc.net/problem/1157
    public static void main(String[] args) throws IOException {
        // 입력: 알파벳 대소문자로 된 문자열가 주어진다.
        // 목표: 이 단어에서 가장 많이 사용된 알파벳을 출력
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // 입력된 값을 전부 대문자로 변환
        String inputStr = br.readLine().toUpperCase();

        // 개수를 저장할 정수형 배열 선언 => 'Z'가 90이기 때문에 해당 숫자만큼 배열 선언
        int[] countChar = new int[91];

        // 입력된 문자열을 반복문을 통해 문자로 나눠서 countChar 인덱스에 해당하는 부분에 +1
        // 중복되는 문자가 있으면 그 만큼 + 1 해준다.
        for(int i = 0; i < inputStr.length(); i++) {
            countChar[inputStr.charAt(i)]++;
        }

        // countChar에 있는 요소 중 가장 큰 값을 찾아 해당 요소의 인덱스 번호로 result 변수에 문자형으로 할당
        // 중복되는 최고값이 있으면 result에 '?' 할당
        int maxNum = 0;
        char result = '?';
        for(int i = 'A'; i < countChar.length; i++) {
            if(countChar[i] > maxNum) {
                maxNum = countChar[i];
                result = (char)i;
            } else if(countChar[i] == maxNum) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
