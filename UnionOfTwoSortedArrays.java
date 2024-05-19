import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};
        System.out.println(Arrays.toString(brute(arr1,arr2)));
        System.out.println(optimal(arr1,arr2));

    }
    //brute
    //tc: o(n1logn+ n2logn+ n1+n2) sc: o(n1+n2) to return the answer
    static int[] brute(int[] arr1, int[] arr2){
        HashSet<Integer> list = new HashSet<Integer>();
          for (int i=0;i< arr1.length;i++){
              list.add(arr1[i]);
          }
        for (int i=0;i< arr2.length;i++){
            list.add(arr2[i]);
        }
        int[] union = new int[list.size()];
        int index=0;
        for (int it: list){
            union[index]=it;
            index++;
        }
        return union;
    }
    static ArrayList<Integer> optimal(int[] arr1, int[] arr2){
        ArrayList<Integer> union = new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]<=arr2[j]){
                if(union.size()==0  || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }else {
                if (union.size()==0 || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i< arr1.length){
            if(union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while (j< arr2.length){
            if(union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
}
