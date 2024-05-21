import java.util.HashMap;

public class LongestPositiveSubArrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,1,1,1,4,2,3};
        int d=3;
        System.out.println(brute(arr,d));
        System.out.println(better(arr,d));
        System.out.println(better2(arr,d));
    }
    //tc:o(n*n*n)
    static int brute(int[] arr, int d){
        int len=0;
        for(int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                int sum=0;
                for (int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==d){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    static int better(int[] arr, int d){
        int len=0;
        for(int i=0;i< arr.length;i++){
           int sum=0;
            for (int j=i;j< arr.length;j++) {
                sum += arr[j];

                if (sum == d) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
    static int better2(int[] arr, int d){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int len =0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
            if (sum==d){
                len =Math.max(len,i+1);
            }
            int rem = sum-d;
            if(map.containsKey(rem)){
                int templen = i- map.get(rem);
                len= Math.max(len,templen);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }

}
