public class ex15 {

   static class Solution {
        public int solution(int[] arr) {
            int answer = 0;
            int[] count = new int[arr.length];
            int x = 0;
            int count2 = 0;
            boolean check = true;


            while(check) {
                for(int i=0; i<arr.length; i++) {
                    if(arr[i]>=50 && arr[i]%2==0) arr[i] /= 2;
                    else if(arr[i]<50 && arr[i]%2==1) arr[i] = arr[i]*2+1;

                    //비교하기 위해 카운트 배열에 값 저장해두고..
                    count[i] = arr[i];
                    x++;
                    //그 뒤로부터 모든 카운트 값과 arr 값이 같은지 확인한다.
                    if(x>1) {
                        for(int j=0; j<arr.length; j++) if(arr[j]==count[j]) count2++;
                        if(count2==arr.length) {
                            answer = x;
                            check = false;
                        }
                    }

                }


            }

            return answer;
        }
    }

    public static void main(String[] args) {

       int[] arr = {1, 2, 3, 100, 99, 98};
       Solution solution =  new Solution();
       solution.solution(arr);
       System.out.println(solution.solution(arr));

    }

}
