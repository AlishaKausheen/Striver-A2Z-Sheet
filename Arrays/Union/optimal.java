package Arrays.Union;

import java.util.ArrayList;

public class optimal {
    public static void main(String args[]){
        int n1=10,n2=7;
        int[] arr1={1,4,5,7,8,10,12,13,15,16};
        int[] arr2={1,2,3,4,7,8,11};
        ArrayList<Integer> Union= FindUnion(arr1,arr2,n1,n2);
        for(int i=0;i< Union.size();i++){
            System.out.print(Union.get(i)+" ");
        }
    }
    public static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2 , int n1, int n2){
        ArrayList<Integer> Union = new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if (arr1[i]<=arr2[j]){
                if(Union.size()==0||(Union.size()-1)!=arr1[1]){
                    Union.add(arr1[i]);
                    i++;
                }
                else{
                    if(Union.size()==0||(Union.size()-1)!=arr2[j]){
                        Union.add(arr2[j]);
                        j++;
                    }
                }

                while (j<n2){
                    if (Union.get(Union.size()-1)!=arr2[j]){
                        Union.add(arr2[j]);
                        j++;
                    }
                }
            }
        }
        return Union;
    }
}
