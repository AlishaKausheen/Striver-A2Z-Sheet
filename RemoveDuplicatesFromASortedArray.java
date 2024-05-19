import java.util.HashSet;

public class RemoveDuplicatesFromASortedArray {
    public static void main(String [] args){
        int[] arr = {1,1,2,2,2,3,3,4};
        //brute force
        //tc: o(nlogn+n) sc:o(n)
        HashSet<Integer> unique = new HashSet<Integer>();
        for(int i=0;i< arr.length;i++){
            unique.add(arr[i]);
        }
        int index=0;
        for(int i: unique){
            arr[index]= i;
            index++;
        }
        System.out.println(index);

        //optimal
        //tc: o(n) sc:o(1)
        //2 pointer approach
        int [] arr2 = {1,1,2,2,2,3,3,4};
        int i=0;
        for(int j=1;j<arr2.length;j++){
            if(arr2[i]!=arr2[j]){
                arr2[i+1]=arr2[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
