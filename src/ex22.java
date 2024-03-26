import java.util.*;
public class ex22 {



    static class Solution {
        public int solution(String[] spell, String[] dic) {
            int answer = 1;

            int count = 0;
            ArrayList<String> list = new ArrayList<>();

            for(int i=0; i<spell.length; i++) list.add(spell[i]);

            for(int i=0; i<dic.length; i++) {
                count = 0;
                for(int j=0; j<dic[i].length(); j++) {
                    if(list.contains(dic[i].charAt(j))) count++;
                }

                if(count==dic[i].length()) answer = 2;
            }
            return answer;
        }
    }
}

