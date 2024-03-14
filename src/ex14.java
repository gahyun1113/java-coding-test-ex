import java.util.*;
public class ex14 {



    static class Solution {
        public ArrayList solution(int[] arr, int[] query) {
            int[] answer = {};
            int index = -1;
            ArrayList<Integer> list = new ArrayList<>();

            for(int i =0; i<query.length; i++) {

                //i가 짝수일 경우 쿼리값 뒷부분 부터 자른다.
                if(i%2==0) {
                    //arr중에서 쿼리값을 갖는 인덱스를 찾는다
                    for(int j=0; j<arr.length; j++) {
                        if(arr[j]==query[i]) index = j;

                        System.out.println("-------i가 짝수인 경우");
                        System.out.println("i:"+i);
                        System.out.println("j:"+j);
                        System.out.println("arr[j]:"+arr[j]);
                        System.out.println("query[i]:"+query[i]);
                        System.out.println("index:"+index);
                        System.out.println("-------인덱스 값 까지 구함");
                    }

                    //인덱스를 찾았으니 해당 인덱스 뒤부터 자른다.
                    for(int q=index+1; q<arr.length;q++) {
                        arr[q] = -1;

                        System.out.println("-------------인덱스 뒤부터 자를거임");
                        System.out.println("q:"+q);
                        System.out.println("arr[q]:"+arr[q]);
                        System.out.println("-------------짝수인 경우 끝남");

                    }
                }

                //i가 홀수일 경우 쿼리값 뒷부분 부터 자른다.
                if(i%2==1) {
                    //arr중에서 쿼리값을 갖는 인덱스를 찾는다
                    for(int j=0; j<arr.length; j++) {
                        if(arr[j]==query[i]) index = j;

                        System.out.println("-------i가 홀수인 경우");
                        System.out.println("i:"+i);
                        System.out.println("j:"+j);
                        System.out.println("arr[j]:"+arr[j]);
                        System.out.println("query[i]:"+query[i]);
                        System.out.println("index:"+index);
                        System.out.println("-------인덱스 값 까지 구함");
                    }

                    //인덱스를 찾았으니 해당 인덱스 앞부터 자른다.
                    for(int q=0; q<index ; q++) {
                        arr[q] = -1;

                        System.out.println("-------------인덱스 뒤부터 자를거임");
                        System.out.println("q:"+q);
                        System.out.println("arr[q]:"+arr[q]);
                        System.out.println("-------------홀수인 경우 끝남");

                    }
                }

            }

            //arr 에서 -1값이 아닌 애들만 리스트에 추가한다
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != -1) list.add(arr[i]);
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr= {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        solution.solution(arr, query);



    }
}
