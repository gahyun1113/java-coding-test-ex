import java.util.Arrays;
public class ex20 {



    static class Solution {
        public int[] solution(int[] numlist, int n) {
            Arrays.sort(numlist);

            for(int i=0; i<numlist.length; i++) {
                for(int j=0; j<numlist.length; j++) {
                    //배열을 계속 돌면서 큰값 먼저 앞에 넣고 뒤로갈수록 또 큰값이 나오면 큰값을 그 자리에 놓는다
                    //두수의 차이가 값을경우 큰 값을 먼저 넣어야 하므로 큰값이 먼저 들어가있고 차이가 같은 값이
                    //들어오면 그 뒤에 들어갈 것이다.
                    
                    if(Math.abs(n-numlist[i]) <= Math.abs(n-numlist[j])) {
                        System.out.println("if문 동작=========");
                        System.out.println("i : "+i);
                        System.out.println("j : "+j);

                        int temp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = temp;
                        System.out.println(Arrays.toString(numlist));
                    }
                }
            }

            return numlist;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;
        solution.solution(numlist,n);


    }
}
