import java.lang.reflect.Array;
import java.util.Arrays;

public class ex04 {
    static class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];


            for(int i =0; i<queries.length ; i++) {

                answer[i] = -1;

                //쿼리에서 가장 큰 값을 찾는다.
                int max = queries[i][0];
                if(queries[i][1] > queries[i][0]) max = queries[i][1];
                else if(queries[i][2] > max) max = queries[i][2];

                //max값보다는 크면서 가장 작은 값을 arr 에서 구한다.

                int min = 0;

                for(int j=0; j<arr.length; j++) {

                    if(arr[j] >= max && (arr[j] < arr[j+1]) ) min = arr[j];

                }

                answer[i] = min;



            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = {0, 1, 2, 4, 3};
        int queries[][] = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        solution.solution(arr,queries);

    }

}
