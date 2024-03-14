public class ex12 {

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
                    if (arr[j] > k) {
                        min = arr[j];
                        if(j!=e) {
                            if(arr[j+1]<min ) min=arr[j+1];
                        }



                    }  //현재값이 k보다 크면 우선 최소값에 넣어두고.
                    // 현재 최소값보다 더 작은 값이 있으면 그걸 최소값에 넣는다.




                    System.out.println("s:"+s);
                    System.out.println("e:"+e);
                    System.out.println("k:"+k);
                    System.out.println("j:"+j);
                    System.out.println("arr[j]:"+arr[j]);
                    System.out.println("min:"+min);
                    System.out.println("------------");

                }

                answer[i] = min;

            }

            for(int q =0; q<answer.length; q++) {
                System.out.println(answer[q]);
            }

            return answer;

        }



    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr ={0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        solution.solution(arr,queries);

    }
}
