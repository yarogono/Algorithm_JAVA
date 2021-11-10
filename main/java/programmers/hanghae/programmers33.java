package programmers.hanghae;

public class programmers33 {
    // 프로그래머스 로또의 최고 순위와 최저 순위 => https://programmers.co.kr/learn/courses/30/lessons/77484
    public int[] solution(int[] lottos, int[] win_nums) {
        // 입력: lottos => 구매한 로또 번호 6자리
        // 입력: win_nums => 당첨 번호 6자리
        int lowRank = 7;
        int topRank = 7;

        // 최저 순위 확인
        lowRank = checkRank(lottos, win_nums);

       // 지워진 로또번호 win_nums 배열로 채워넣는 반복문
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                lottos[i] = win_nums[i];
            }
        }

        // 최고 순위 확인
        topRank = checkRank(lottos, win_nums);

        if(lowRank == 7)
            lowRank = 6;

        if(topRank == 7)
            topRank = 6;

        int[] answer = {topRank, lowRank};
        return answer;
    }

    // 순위 확인 메서드
    private int checkRank(int[] lottos, int[] win_nums) {
        int rankNum = 7;

        for(int i = 0;i < lottos.length; i++) {
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    rankNum--;
                }
            }
        }
        return rankNum;
    }

    // 테스트용 메인 함수(테스트 값 => lottos, win_nums)
    public static void main(String[] args) {
        programmers33 test = new programmers33();
        int[] lottos = { 0, 0, 0, 0, 0, 0 };
        int[] win_nums = { 38, 19, 20, 40, 15, 25 };
        test.solution(lottos, win_nums);
    }
}
