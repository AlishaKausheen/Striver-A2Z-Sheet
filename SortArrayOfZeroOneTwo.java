import java.util.Arrays;

public class SortArrayOfZeroOneTwo {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,1,2,1,2,0,0,0,1};
        System.out.println(Arrays.toString(better(arr)));
        System.out.println(Arrays.toString(optimal(arr)));
    }
    //tc:o(2n) sc:o(1)
    static int[] better(int[] arr){
        int count0=0,count1=0,count2=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0)
                count0++;
            else if (arr[i]==1)
                count1++;
            else {
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for (int i=count0;i<count0+count1;i++){
            arr[i]=1;
        }
        for (int i=count0+count1;i< arr.length;i++){
            arr[i]=2;
        }
        return arr;
    }
//dutch national flag algorithm
    //tc: o(n) sc:o(1)
    static int[] optimal(int[] arr){
        int low =0, mid=0, high = arr.length-1;
        while (mid<=high){
            if (arr[mid]==0){
                int temp =arr[low];
                arr[low] = arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
}
