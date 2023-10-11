package Arrays.CheckArrayIsSorted;

import java.util.Scanner;

public class SortCheck {
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
        System.out.println("the array is sorted :"+ check(arr));
    }
    public static boolean check(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[arr.length - 1]) {

            } else {
                return false;
            }
        }
        return  true;
    }
}
