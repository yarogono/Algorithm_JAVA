package programmers.hanghae;

public class programmers25 {
    // 프로그래머스 정수 제곱근 판별 만들기 => https://programmers.co.kr/learn/courses/30/lessons/12934
    public long solution(long n) {
        // 입력: 임의의 양의 정수 n
        // 목표: n이 어떤 양의 정수 x의 제곱인지 아닌지 판단
        //       n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴,
        //       n이 양의 정수 x의 제곱이 아니라면 -1을 리턴
        long answer = 0;

        // Math.sqrt()
        // => Math 클래스의 sqrt() 메서드로 double 타입의 인수를 전달하면 인수에 대한 double 타입의 제곱근 값을 리턴
        // * 제곱근은 음수가 나올 수 없으므로 음수를 입력하면 NaN(Not a Number)을 리턴해줍니다.
        double squareRoot = Math.sqrt(n);   // squareRoot => 제곱근


        // Math 클래스의 pow 메서드는 거듭제곱 계산을 해준다.
        // squareRoot에 +1을 한 후 제곱 값을 구해준다.
        // 여기서 숫자의 범위에 신경써서 (long) 형식으로 변환해서 answer에 할당 해준다.
        if(squareRoot - (int)squareRoot > 0) {
            answer = - 1;
            return answer;
        }
        answer = (long)(Math.pow(squareRoot + 1, 2));

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        programmers25 test = new programmers25();
        long n = 3;
        test.solution(n);
    }
}
