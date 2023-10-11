package Arrays.SecondLargest;

import java.util.Arrays;
import java.util.Scanner;

public class bruteForce {
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
        Arrays.sort(arr);
        largest = arr[n-1];
        int sLargest=-1;
        for(int i=n-2;i>=0;i++)
        {
            if(arr[i]!=largest)
            {
                sLargest=arr[i];
                break;
            }
        }
        System.out.println("Second Largest element in the array is :"+sLargest);
    }
}
