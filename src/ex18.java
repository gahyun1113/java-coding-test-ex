//프로그래머스 lv.0 날짜 비교하기
public class ex18 {

    static class Solution {
        public int solution(int[] date1, int[] date2) {
            int answer = 0;
            String string_date1 = "";
            String string_date2 = "";

            for(int i=0; i<date1.length; i++) {
                string_date1 += Integer.toString(date1[i]);
                string_date2 += Integer.toString(date2[i]);
            }

            System.out.println("string_date1 : " +string_date1);
            System.out.println("string_date1 : " +string_date1);
            System.out.println("두 값 비교 " );
            System.out.println(Integer.parseInt(string_date2)<Integer.parseInt(string_date1));


            if(Integer.parseInt(string_date1)>Integer.parseInt(string_date2)) answer =1;
            else answer = 0;

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};
        solution.solution(date1, date2);

    }
}
