package programmers.hanghae;

public class programmers23 {
    // 프로그래머스 자연수 뒤집어 배열로 만들기 => https://programmers.co.kr/learn/courses/30/lessons/12932
    public int[] solution(long n) {
        int n_length = (int)(Math.log10(n)+1);
        int[] answer = new int[n_length];

        for(int i=0 ; i<n_length ; i++){
            double insert_n = (double)n%Math.pow(10,i+1)/Math.pow(10,i);
            answer[i]=(int)insert_n;
        }

        return answer;
    }
}
