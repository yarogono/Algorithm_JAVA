package programmers.hanghae;

import java.util.ArrayList;
import java.util.HashMap;

public class programmers38 {
    // 프로그래머스 숫자 문자열과 영단어 => https://programmers.co.kr/learn/courses/30/lessons/81301
    public int solution(String s) {
        // 입력 : 영단어와 숫자가 섞인 String 변수
        // 목표 : String으로 작성된 숫자 영단어를 숫자로 바꾸기 (예시: one => 1 )
        int answer = 0;

        // 각 숫자에 대응하는 영단어
        HashMap<Integer, String> hashMap = new HashMap<>(){{
           put(0, "zero");
           put(1, "one");
           put(2, "two");
           put(3, "three");
           put(4, "four");
           put(5, "five");
           put(6, "six");
           put(7, "seven");
           put(8, "eight");
           put(9, "nine");
        }};



        ArrayList<Integer> listInt = new ArrayList<>();

        // 1. 해쉬맵에 있는 값들로 s 문자열 안에 해당 문자가 몇번째 인덱스에 있는지 확인
        // 2. 같은 문자를 찾으면 strIndex 값은 0 보다 크거나 같다.
        // 3. 해쉬맵의 밸류를 값을 i 변수로 대신해서 넣는다. (키 값)
        for(int i = 0; i < hashMap.size(); i++) {
            int strIndex = s.indexOf(hashMap.get(i));
            if(strIndex != -1) {
                listInt.add(i);
            }
        }
        
        // 1. listInt에 있는 값들을 반복문으로 돌려 해쉬맵 키 값을 넣는 자리에 추가해 value 값을 얻어낸다.
        //    => hashMap.get(listInt.get(i))
        // 2. 얻어낸 value 를 바탕으로 해당 문자열을 숫자로 바꿔준다.
        for(int i = 0; i < listInt.size(); i++) {
             s = s.replace(hashMap.get(listInt.get(i)), listInt.get(i).toString());
        }

        answer = Integer.parseInt(s);
        
        return answer;
    }

    // 테스트용 메인 메서드
    public static void main(String[] args) {
        programmers38 test = new programmers38();
        String s = "one4seveneight";
        test.solution(s);
    }
}
