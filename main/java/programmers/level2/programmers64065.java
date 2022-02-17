package programmers.level2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2).replace("{", "");

        String[] t = s.split("},");
        // compare 메서드 오버라이딩을 통한 재정립
        // - 문자열의 길이가 짧은 순서대로 정렬
        Arrays.sort(t, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        ArrayList<Integer> arrayList = new ArrayList<>();

        // 정렬된 문자배열의 각 문자열을 ',' 을 기준으로 split
        for(int i = 0; i < t.length; i++) {
            String[] tempStr = t[i].split(",");
            // split한 각 문자들을 정수형으로 변환 후 중복되지 않게 arrayList에 추가한다.
            // - 여기서 arrayList에 중복되는 숫자는 추가를 하지 않는다.
            for(int j = 0; j < tempStr.length; j++) {
                int tempInt= Integer.parseInt(tempStr[j]);
                if(!arrayList.contains(tempInt))
                    arrayList.add(tempInt);
            }
        }

        // arrayList의 각 정수형 값을 answer int배열에 할당해준다.
        int[] answer = new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}

public class programmers64065 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        solution.solution(s);
    }
}
