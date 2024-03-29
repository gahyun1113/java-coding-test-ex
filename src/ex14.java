//프로그래머스 Lv.0 배열 조각하기

import java.util.*;

public class ex14 {



    static class Solution {
        public ArrayList solution(int[] arr, int[] query) {
            int[] answer = {};
            int index = -1;
            ArrayList<Integer> list = new ArrayList<>();

            //arr 배열을 리스트에 넣는다.
            for(int i =0; i< arr.length;i++){

                list.add(arr[i]);
                System.out.println("------리스트 삽입");
                System.out.println("list("+i+") : "+list.get(i));
            }

            System.out.println("list : "+list);




            for(int i =0; i<query.length; i++) {

                index = -1;
                //i가 짝수일 경우 쿼리값 뒷부분 부터 자른다.
                if(i%2==0) {
                    //arr중에서 쿼리값을 갖는 인덱스를 찾는다
                    for(int j=0; j<list.size(); j++) {
                        if(list.get(j)==query[i]) index = query[i];

                        System.out.println("-------i가 짝수인 경우");
                        System.out.println("i:"+i);
                        System.out.println("j:"+j);
                        System.out.println("list.get(j):"+list.get(j));
                        System.out.println("query[i]:"+query[i]);
                        System.out.println("index:"+index);

                    }

                    System.out.println("-------인덱스 값 까지 구함");

                    //인덱스를 찾았으니 해당 인덱스 뒤부터 자른다.
                    for(int q=0; q<list.size()-index-1 ;q++) {
                        list.remove(list.size()-1);

                        System.out.println("-------------인덱스 뒤부터 자를거임");
                        System.out.println("q:"+q);
                        System.out.println("arr[q]:"+arr[q]);
                        System.out.println("list :"+list);

                        System.out.println("-------------짝수인 경우 끝남");

                    }
                }

                //i가 홀수일 경우 쿼리값 뒷부분 부터 자른다.
                if(i%2==1) {
                    //arr중에서 쿼리값을 갖는 인덱스를 찾는다
                    for(int j=0; j< list.size(); j++) {
                        if(list.get(j)==query[i]) index = query[i];

                        System.out.println("-------i가 홀수인 경우");
                        System.out.println("i:"+i);
                        System.out.println("j:"+j);
                        System.out.println("list.get(j):"+list.get(j));
                        System.out.println("query[i]:"+query[i]);
                        System.out.println("index:"+index);

                    }

                    System.out.println("-------인덱스 값 까지 구함");
                    //인덱스를 찾았으니 해당 인덱스 앞부터 자른다.
                    for(int q=0; q<index ; q++) {
                        list.remove(0);

                        System.out.println("-------------인덱스 앞부터 자를거임");
                        System.out.println("q:"+q);
                        System.out.println("arr[q]:"+arr[q]);
                        System.out.println(list);

                        System.out.println("-------------홀수인 경우 끝남");

                    }
                }

            }


            return list;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr= {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        solution.solution(arr, query);
        System.out.println("list:"+solution.solution(arr, query));




    }
}
