package Arrays.SecondLargest;

import java.util.Arrays;
import java.util.Scanner;

public class better {
    public static void main(String args) {
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
        Arrays.sort(arr);
        int largest = arr[0];
        int sLargest =-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest =arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>sLargest && arr[i]!=largest)
            {
                sLargest=arr[i];
            }
        }
        System.out.println("the second largest element :"+ sLargest);
    }
}