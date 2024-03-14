//프로그래머스 lv.0 코드처리하기
public class ex13 {

    static class Solution {
        public String solution(String code) {
            String answer = "";
            String[] arr = code.split("");
            int mode = 0;


            for(int i =0 ; i<code.length() ; i++) {

                if (mode==0){
                    if(!arr[i].equals(1) && i%2==0) answer += arr[i];
                    else if(arr[i].equals("1")) mode=1;
                }

                else if (mode==1) {
                    if(!arr[i].equals("1") && i%2==1) answer += arr[i];
                    else if(arr[i].equals("1")) mode=0;
                }

                System.out.println("i:" +i);
                System.out.println("arr[i]:" +arr[i]);
                System.out.println("mode:" +mode);
                System.out.println("answer:" +answer);
                System.out.println("------");



            }

            if(answer.equals("")) answer="EMPTY";
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String code = "abc1abc1abc";
        solution.solution(code);
        System.out.println(solution.solution(code));

    }
}
