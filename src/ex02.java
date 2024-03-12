public class ex02 {

    static class Solution {
        public String solution(int[] numLog) {
            String answer = "";

            for(int i =0 ; i<numLog.length-1 ; i++) {

                int minus = numLog[i+1] - numLog[i];

                switch (minus) {
                    case 1 : answer += "w";
                        break;

                    case -1 : answer += "s";
                        break;

                    case 10 : answer += "d";
                        break;

                    case -10 : answer += "a";
                        break;

                }

            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution.solution(arr));


    }

}
