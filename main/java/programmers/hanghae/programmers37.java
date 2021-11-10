package programmers.hanghae;


public class programmers37 {
    // 프로그래머스 소수 만들기 => https://programmers.co.kr/learn/courses/30/lessons/12977
    public int solution(int[] nums) {
        // 입력: 중복되지 않는 숫자 배열(1 ~ 1000 이하의 자연수)
        int answer = -1;
        int count = 0;

        // 처리1: 주어진 숫자 중 3개의 수를 더하는 경우의 수를 구하는 반복문
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    System.out.printf("%d : %d : %d%n", nums[i], nums[j], nums[k]);
                    int sumNum = nums[i] + nums[j] + nums[k];

                    // 처리2: 더해진 값들이 소수인지 판별하는 함수(리턴값 => 0, 1)
                    System.out.println(sumNum);
                    count += isPrime(sumNum);
                }
            }
        }

        // 출력 => count 변수를 answer에 할당
        System.out.printf("결과: %d", count);
        answer = count;
        return answer;
    }

    private int isPrime(int sumNum) {
        int result = 1;

        for(int i = 2; i <= sumNum / 2; i++) {
            if (sumNum % i == 0) {
                result = 0;
            }
        }
        System.out.printf("프라임: %d%n",result);

        return result;
    }

    // 테스트용 메인 함수
    public static void main(String[] args) {
        programmers37 test = new programmers37();
        int[] nums = {1,2,3,4 };
        test.solution(nums);
    }
}
