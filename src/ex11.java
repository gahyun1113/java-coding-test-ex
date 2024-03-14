import java.util.ArrayList;
public class ex11 {



    static class Solution {
        public ArrayList solution(int l, int r) {
            String num="";

            int check = 0;
            int check2 = 0;


            ArrayList<Integer> arr = new ArrayList<>();

            for(int i =l;i<=r; i++) {
                //숫자를 문자형으로 변환
                num = Integer.toString(i);
                String[] nums = num.split("");



                check = 0;
                //문자형으로 변환한 것이 5와 0으로만 이루어져있는지 확인
                for(int j=0; j<nums.length; j++) {
                    if(nums[j].equals("0") || nums[j].equals("5")) check++;

                    System.out.println("i:"+i);
                    System.out.println("num:"+num);
                    System.out.println("j:"+j);
                    System.out.println("nums[j]:"+ nums[j]);
                    System.out.println("check:"+check);
                    System.out.println("-------");

                }

                //문자열의 길이와 체크값이 같은경우 문자열은 전부 5와 0으로 이루어져있다
                if(check==num.length()){
                    arr.add(i);
                    check2++;
                }
            }
            if(check2==0) arr.add(-1);
            return arr;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(5,555);
        System.out.println(solution.solution(5,555));

    }
}
