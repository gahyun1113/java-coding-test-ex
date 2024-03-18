//프로그래머스 lv.0 배열의 원소 삭제하기
import java.util.*;
public class ex17 {



    static class Solution {
        public ArrayList solution(int[] arr, int[] delete_list) {
            int[] answer = {};
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<arr.length; i++) {
                if(!(delete_list.equals(arr[i]))) list.add(arr[i]);
            }
            return list;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        solution.solution(arr,delete_list);
        System.out.println(solution.solution(arr,delete_list));
    }
}
