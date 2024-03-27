public class ex24 {

    static class Solution {
        public int solution(int balls, int share) {
            int answer = 0;
            int ballsP = 1;
            int shareP = 1;
            int count = 0;

            while(count<share) {
                ballsP *= balls;
                count++;
                balls--;
            }
            System.out.println("ballsP : "+ballsP);

            for(int i=1; i<=shareP;i++) {
                shareP *= i;
            }
            System.out.println("shareP : "+shareP);
            return ballsP/shareP;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(5,3);
        System.out.println(solution.solution(5,3));
    }
}
