import java.util.Arrays;

public class ex09 {

    static class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[arr.length];
            int s = 0;
            int e =0;
            int k=0;

            for(int i=0; i<queries.length;i++) {
                s= queries[i][0];
                e= queries[i][1];
                k= queries[i][2];

                for(int j=s; j<=e ; j++) {
                    if(j==0) arr[j]++;
                    else if(j%k==0) arr[j]++;

                    System.out.println("j:"+j);
                    System.out.println("s:"+s);
                    System.out.println("e:"+e);
                    System.out.println("k:"+k);
                    System.out.println("arr[j]:"+arr[j]);
                    System.out.println("arr:"+Arrays.toString(arr));
                    System.out.println("--");

                }
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};

        solution.solution(arr, queries);
        System.out.println(Arrays.toString(solution.solution(arr,queries)));



    }
}
