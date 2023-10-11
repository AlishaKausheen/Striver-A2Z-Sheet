package Arrays.LeftRotateByDPlace;

import java.util.Scanner;

public class optimal {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int d=0;
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
        System.out.println("Specify the position by which the array should be rotated by:");
        if(sc.hasNextInt()){
            d=sc.nextInt();
        }
        if(d>=n){
            d=d%n;
        }
        reverse(0,n-d-1,arr);
        reverse(n-d-1,n-1,arr);
        reverse(0,n-1,arr);
        System.out.println("The rotated array is :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int start,int end, int[] arr){
        int temp;
        while (start<=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
