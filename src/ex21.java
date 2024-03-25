public class ex21 {
    static class Solution {
        public int solution(int[][] dots) {
            int answer = 0;

            //aa bb
            if((dots[0][0]-dots[1][0])/(dots[0][1]-dots[1][1])==(dots[2][0]-dots[3][0])/(dots[2][1]-dots[3][1]) ) answer = 1;

            System.out.println("첫번재 조건문 지남 answer: "+answer);
            System.out.println((dots[0][0]-dots[1][0])/(dots[0][1]-dots[1][1]));
            System.out.println((dots[2][0]-dots[3][0])/(dots[2][1]-dots[3][1]));
            if((dots[0][0]-dots[2][0])/(dots[0][1]-dots[2][1])==(dots[1][0]-dots[3][0])/(dots[1][1]-dots[3][1]) ) answer = 1;
            System.out.println("두번재 조건문 지남 answer: "+answer);
            if((dots[0][0]-dots[3][0])/(dots[0][1]-dots[3][1])==(dots[1][0]-dots[2][0])/(dots[1][1]-dots[2][1]) ) answer = 1;
            System.out.println("세번재 조건문 지남 answer: "+answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        solution.solution(dots);
        System.out.println(solution.solution(dots));
    }
}
