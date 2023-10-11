package Arrays.RemoveDuplicate;

import java.util.Scanner;

public class optimal {
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
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;

            }
        }
        int k = i+1;
        System.out.println("The number of duplicates in the array:"+k);
    }
}
