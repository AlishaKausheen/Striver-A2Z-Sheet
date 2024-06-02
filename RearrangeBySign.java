import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(brute(arr)));
        System.out.println(Arrays.toString(optimal(arr)));
    }
    static int[] brute(int[] arr){
        int[] positive = new int[arr.length/2];
        int[] negative = new int[arr.length/2];
        int j=0,k=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]>0){
                positive[j]=arr[i];
                j++;
            }else {
                negative[k]=arr[i];
                k++;
            }
        }
        for (int i=0;i< arr.length/2;i++){
            arr[2*i]=positive[i];
            arr[2*i+1]= negative[i];
        }
        return arr;
    }
    static int[] optimal(int[] arr){
        int[] ans = new int[arr.length];
        int positiveIndex = 0, negativeIndex=1;
        for (int i=0;i< arr.length;i++){
            if(arr[i]<0){
                ans[negativeIndex]= arr[i];
                negativeIndex+=2;
            }else {
                ans[positiveIndex]= arr[i];
                positiveIndex+=2;
            }
        }
        return ans;
    }
}
