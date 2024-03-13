import java.lang.reflect.Array;
import java.util.Arrays;

public class ex04 {
    static class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];
            int s=0;
            int e=0;
            int k=0;
            int min = 0;

            for(int i = 0; i<queries.length; i++) {
                s=queries[i][0];
                e=queries[i][1];
                k=queries[i][2];

                //arr 돌면서 k보다 큰값중 가장 작은 값을 찾는다
                min = -1;

                for(int j=s; j<=e; j++) {
                    if(arr[j]>k && min>arr[j]) min=arr[j];
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
