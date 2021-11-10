package programmers.hanghae;

import java.util.ArrayList;
import java.util.Arrays;

public class programmers34 {
    // 프로그래머스 모의고사 => https://programmers.co.kr/learn/courses/30/lessons/42840
    public int[] solution(int[] answers) {
        ArrayList<Integer> resultArr = new ArrayList();

        // 수포자들이 답을 찍는 패턴이 담긴 배열
        int[] personOne = { 1, 2, 3, 4, 5 };
        int[] personTwo = { 2, 1, 2, 3, 2, 4, 2, 5};
        int[] personThree = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        // 수포자들의 정답을 저장할 배열(scores) 생성
        int[] scores = { 0, 0, 0 };

        // 수포자들의 답과 실제 답을 비교해 맞은 개수 각 변수에 저장 맞은 개수를 배열(scores)에 저장한다.
        for(int i = 0; i < answers.length; i++){
            if(personOne[i % 5] == answers[i]){ scores[0]++;}
            if(personTwo[i % 8] == answers[i]){ scores[1]++;}
            if(personThree[i % 10] == answers[i]){ scores[2]++;}
        }


        // scores배열을 새로운 배열인 arr로 복사한다.
        int[] arr = new int[scores.length];

        for(int i = 0; i < scores.length; i++) {
            arr[i] = scores[i];
        }

        // 제일 많이 맞은 개수를 알기 위하여 arr을 오름차순으로 정렬한다.
        // 그러면 가장 많이 맞은 정답 개수는 arr[2]에 담기게 된다.
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            if(scores[i] == arr[2]) {
                resultArr.add(i + 1);
            }
        }

        int[] answer = new int[resultArr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = resultArr.get(i);
        }

        return answer;
    }

    // 테스트용 메인 메서드
    public static void main(String[] args) {
        programmers34 test = new programmers34();
        int[] answers = { 1,2,3,4,5 };
        test.solution(answers);
    }
}
