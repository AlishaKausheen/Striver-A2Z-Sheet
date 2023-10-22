package Arrays.MissingNumber;

public class Sum {
    public static void main(String args[]){
        int[] arr = {1,2,4,5};
        int sumOriginal= (arr.length*(arr.length+1))/2;
        int sumInArray =0;
        for (int i=0;i<arr.length-1;i++){
            sumInArray+=arr[i];
        }
        int ans= sumOriginal-sumInArray;
        System.out.print(ans+" is the missing number");
    }
}
