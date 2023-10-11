package Arrays.LeftRotateBy1Place;

import java.util.Scanner;

public class generalSolution {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        System.out.println("Enter the length of the array :");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        System.out.println("Enter the Elements of the array");
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        int temp = arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println("The left rotated array by 1 :");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
