package largestNumber;

import java.util.*;

public class BruteForce {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int largest=Integer.MIN_VALUE;
        int n=0;
        System.out.println("Enter the length of the array :");
        if(sc.hasNextInt())
        {
            n = sc.nextInt();
        }
       int[] arr= new int[n];
        System.out.println("Enter the Elements of the array");
        for (int i=0;i<n;i++)
        {
            if(sc.hasNextInt())
            {
                arr[i]=sc.nextInt();
            }
        }
       for (int i=0;i<n;i++)
       {
           for(int j=1;j<n;j++)
           {
               int temp=0;
               if(arr[i]>arr[j])
               {
                   temp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
           System.out.println("The largest number in the given array :"+ arr[n-1]);
       }


    }
}
