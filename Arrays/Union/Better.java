package Arrays.Union;
import java.util.ArrayList;
import java.util.HashSet;

public class Better {
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
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i=0;i<n1;i++){
            s.add(arr1[i]);
        }
        for (int i=0;i<n2;i++){
            s.add(arr2[i]);
        }
        for(int it:s){
            Union.add(it);
        }
        return Union;
    }
}
