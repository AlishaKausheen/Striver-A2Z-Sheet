import java.util.Arrays;

public class LeftRotateTheArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        //tc: o(n) sc:o(1)
        int temp = arr[0];
        for(int i=1;i< arr.length;i++){
            arr[i-1]= arr[i];
        }
        arr[arr.length-1]= temp;
        System.out.println(Arrays.toString(arr));
    }
}
