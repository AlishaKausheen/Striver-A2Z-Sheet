package Arrays.MoveZeroesToEnd;

import java.util.ArrayList;

public class BruteForce {
    public static void main (String args[])
    {
        int[] arr= {1,0,2,3,2,2,0,0,4,5};
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for(int i=0;i< temp.size();i++)
        {
            arr[i]= temp.get(i);
        }
        for(int i= temp.size();i<arr.length;i++)
        {
            arr[i]=0;
        }
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
