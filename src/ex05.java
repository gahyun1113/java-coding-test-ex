import java.util.ArrayList;

public class ex05 {

   static class Solution {
        public ArrayList solution(int n) {
            int[] answer = {};
            ArrayList<Integer> arr = new ArrayList<>();

            arr.add(n);

            while(true) {

                if (n % 2 == 0) {
                    n /= 2;
                    arr.add(n);
                } else if (n % 2 == 1 && n != 1) {
                    n = n * 3 + 1;
                    arr.add(n);
                } else {
                    arr.add(n);
                }

                if (n == 1) break;


            }
            return arr;
        }
    }

}
