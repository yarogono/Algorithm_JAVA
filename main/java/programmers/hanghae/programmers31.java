package programmers.hanghae;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class programmers31 {
    // 프로그래머스 같은 숫자는 싫어 => https://programmers.co.kr/learn/courses/30/lessons/12906
    public int[] solution(int []arr) {
        // 입력: 배열 arr => 각 원소는 숫자 0 ~ 9
        // 목표: 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
        // 제거된 후 남은 수들을 반환할 때 배열 arr의 원소들의 순서를 유지 => ArrayList<String> 사용
        ArrayList<Integer> resultArr = new ArrayList<>();

        // tempNum : 중복 검사를 위해 배열의 각 요소 -1 인덱스 값을 저장하는 변수
        int tempNum = 10;

        // 중복 검사를 해서 중복되지 않는 값을 ArrayList 에 추가 해준다.
        for(int i = 0; i < arr.length; i++) {
            if(tempNum != arr[i]) {
                resultArr.add(arr[i]);
            }
            tempNum = arr[i];
        }

        // ArrayList의 결과 값을 반복문을 통해 answer 배열에 할당 해준다.
        int[] answer = new int[resultArr.size()];
        for(int i = 0; i < answer.length; i++) {
           answer[i] = resultArr.get(i);
        }

        return answer;
    }

    // 테스트용 메인 함수
    public static void main(String[] args) {
        programmers31 test = new programmers31();
        int[] arr = { 0, 1, 0, 1 };
        test.solution(arr);
    }
}
