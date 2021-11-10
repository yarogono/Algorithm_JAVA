package programmers.hanghae;

import java.util.Arrays;
import java.util.HashSet;

public class programmers32 {
    // 프로그래머스 두 개 뽑아서 더하기 => https://programmers.co.kr/learn/courses/30/lessons/68644
    public int[] solution(int[] numbers) {
        // 입력: 정수 배열 numbers
        // numbers에서 서로 다른 인덱스에 있는 두 수를 뽑아 더해서 만들 수 있는 모든 수를 배열로 리턴
        // 중복된 값이 입력 되지 않도록 HashSet 사용
        HashSet<Integer> resultArr = new HashSet<>();

        // 처리1: 2중 반복문을 통해 두 수 더하기 경우의 수
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int sumNum = numbers[i] + numbers[j];
                resultArr.add(sumNum);
            }
        }

        // 리턴할 answer 정수 배열을 resultArr과 같은 크기로 선언
        int[] answer = new int[resultArr.size()];

        // foreach를 활용해 resultArr에 있는 값을 answer 배열에 할당
        int i  = 0;
        for (int temp : resultArr) {
            answer[i] = temp;
            i++;
        }

        // answer 정수 배열을 오름차순으로 정렬
        Arrays.sort(answer);
        return answer;
    }

    // 테스트용 메인 메서드
    public static void main(String[] args) {
        programmers32 test = new programmers32();
        int[] numbers = { 2,1,3,4,1 };
        test.solution(numbers);
    }
}
