public class ex16 {

    static class Solution {
        public int solution(String[] strArr) {
            int answer = 0;

            int[] num = new int[30];
            int[] arrlength = new int[strArr.length];
            int max = 0;


            System.out.println("arrlength[i]--------");
            for(int i=0; i<strArr.length; i++) {
                arrlength[i] = strArr[i].length();
                System.out.println("arrlength["+i+"] :" +arrlength[i]);
            }

            for(int i=0; i<arrlength.length; i++) {
                System.out.println("num[]------------");
                for(int j=1; j<num.length; j++) {
                    if(arrlength[i]==j) num[j]++;

                    System.out.println("num["+j+"] :" +num[j]);
                }
            }

            //최대값을 찾자
            max = num[1];
            for(int i=1; i<num.length; i++) {
                if (max<num[i]) max = num[i];
                System.out.println("i: "+i+"  max :"+max);

            }

            System.out.println("max : "+max);


            return max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strArr = {"a","bc","d","efg","hi"};
        solution.solution(strArr);
//        System.out.println(solution.solution(strArr));
    }
}
