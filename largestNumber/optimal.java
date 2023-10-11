package largestNumber;

import java.util.Scanner;

public class optimal {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
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
        int largest = arr[0];
        for (int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest element in the array is : "+ largest);
    }
}
