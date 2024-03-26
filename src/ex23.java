public class ex23 {

    static class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = new int[2];
            int a = 0;
            int b = 0;

            //최대값을 넘어간 경우
            int maxA = board[0]/2;
            int maxB = board[1]/2;

            for(int i=0; i<keyinput.length; i++) {

                switch (keyinput[i]) {
                    case "up" :
                        if(b<maxB && b>-maxB) b++;
                        break;

                    case "down" :
                        if(b<maxB && b>-maxB) b--;
                        break;

                    case "left" :
                        if(a<maxA && a>-maxA) a--;
                        break;

                    case "right" :
                        if(a<maxA && a>-maxA) a++;
                        break;

                }


            }


            answer[0] = a;
            answer[1] = b;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}
