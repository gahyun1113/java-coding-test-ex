import java.util.ArrayList;
public class ex10 {
   static class Solution {
        public ArrayList solution(int l, int r) {
            int[] answer = {};
            String num="";
            int check = 0;

            ArrayList<Integer> arr = new ArrayList<>();

            for(int i =l;i<=r; i++) {
                //숫자를 문자형으로 변환
                num = Integer.toString(i);

                //문자형으로 변환한 것이 5와 0으로만 이루어져있는지 확인
                for(int j=0; j<num.length(); j++) {
                    if(num.charAt(i)=='5' ||num.charAt(i)=='0') check++;
                }

                //문자열의 길이와 체크값이 같은경우 문자열은 전부 5와 0으로 이루어져있다
                if(check==num.length()) arr.add(i);
            }

            return arr;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(5,5);
        System.out.println(solution.solution(5,5));
    }
}
