public class ex19 {

    static class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;
            String str_k = k+"";
            for(int index = i; index<=j; index++) {

                if(Integer.toString(index).contains(str_k)) answer++;
                System.out.println("index: "+index);
                System.out.println("answer:  "+answer);
                System.out.println("==============");
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(1,13,1));
    }
}
