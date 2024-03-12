public class ex03 {

    static class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = {};
            int n=0;

            //배열의 두 값을 서로 교체할때
            // 1. 변수를 하나 생성하여 첫번째 값을 저장
            // 2. 첫번째 값을 두번째 값으로 변경
            // 3. 두번째 값을 변수에 저장한 값으로 변경

            for(int i=0; i<queries.length; i++) {
                n = arr[queries[i][0]];
                arr[queries[i][0]] = arr[queries[i][1]];
                arr[queries[i][1]] = n;

            }
            answer = arr;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = {0, 1, 2, 3, 4 };
        int queries[][] = {{0, 3},{1, 2},{1, 4}};
        System.out.println(solution.solution(arr, queries));


    }


}
