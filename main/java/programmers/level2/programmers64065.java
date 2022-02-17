package programmers.level2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2).replace("{", "");

        String[] t = s.split("},");
        Arrays.sort(t, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < t.length; i++) {
            String[] tempStr = t[i].split(",");
            for(int j = 0; j < tempStr.length; j++) {
                int tempInt= Integer.parseInt(tempStr[j]);
                if(!arrayList.contains(tempInt))
                    arrayList.add(tempInt);
            }
        }

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
