import java.util.Arrays;

public class LargestElementInAnArray {
    public static void main(String[] args){
        int[] arr = {3,2,1,5,2};
        //brute force approach
        //TC :O(NLOGN) SC: O(1)
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        //optimal solution
        //TC: O(n) sc: o(1)
        int largest = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.print(largest);
    }
}
