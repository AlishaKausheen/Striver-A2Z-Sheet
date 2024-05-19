import java.util.Arrays;

public class SecondLargestElementInAnArray {
    public static  void main(String [] args){
      int[] arr = {1,4,2,7,7,5};
      //brute force
        //tc: o(nlogn+n) sc:o(1)
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for (int i= arr.length-2;i>=0;i--){
            if(arr[i]<largest){
                System.out.println(arr[i]);
                break;
            }
        }
        //better
        //tc: o(2n) sc: o(1)
        int[] arr2 = {1,2,4,7,7,5};
        int largest2 = arr2[0];
        for(int i=0;i< arr2.length;i++){
            if(arr2[i]>largest2){
                largest2 = arr2[i];
            }
        }
        int secondlargest = -1;
        for(int i=0;i< arr2.length;i++){
            if(arr2[i]>secondlargest && arr2[i]<largest2){
                secondlargest = arr2[i];
            }
        }
        System.out.println(secondlargest);
        //optimal
        //tc: o(n) sc: o(1)
        int largest3=arr[0];
        int secondlargest3 = -1;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>largest3){
                secondlargest3= largest3;
                largest3 = arr2[i];
            }else if(arr2[i]<largest3 && arr2[i]>secondlargest3){
                secondlargest3 = arr2[i];
            }
        }
        System.out.println(secondlargest3);
    }
}
