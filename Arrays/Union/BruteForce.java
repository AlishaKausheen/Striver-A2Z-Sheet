package Arrays.Union;

import java.util.ArrayList;
import java.util.HashMap;

//Using HashMap
public class BruteForce {
    public static void main(String args[]){
        int n1=10,n2=7;
        int[] arr1={1,4,5,7,8,10,12,13,15,16};
        int[] arr2={1,2,3,4,7,8,11};
        ArrayList<Integer> Union= FindUnion(arr1,arr2,n1,n2);
        for(int i=0;i< Union.size();i++){
            System.out.print(Union.get(i)+" ");
        }
    }
    public static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2, int n1,int n2){
        HashMap<Integer,Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i=0;i<n1;i++){
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
        }
        for (int i=0;i<n2;i++){
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        }
        for (int it: freq.keySet()){
            Union.add(it);
        }
        return Union;
    }
}
