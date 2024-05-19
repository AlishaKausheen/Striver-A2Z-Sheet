import java.util.Arrays;

public class LeftRotateTheArrayByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d=2;
        //brute force
          // tc:o(2d+n-d) sc:o(d)
        d= d%arr.length;
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i]= arr[i];
        }
        for(int i =d;i< arr.length;i++){
            arr[i-d]=arr[i];
        }
        int j=0;
        for (int i= arr.length-d;i< arr.length;i++){
            arr[i]= temp[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
        //optimal
        int[] arr1= {1,2,3,4,5,6,7,8};
        int d1=2;
        leftRotate(arr1, arr1.length, d1);
        System.out.println(Arrays.toString(arr1));
    }
   static void reverse(int[] arr , int start, int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
   }
   static void leftRotate(int[] arr, int n, int d){
        if(n==0)
            return;
        d=d% arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d,n-1);
        reverse(arr,0,n-1);
   }
}
