package Arrays.LeftRotateByDPlace;

import java.util.ArrayList;
import java.util.Scanner;

public class bruteForce {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int d= 0;
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
        System.out.println("Specify the position by which the array is left rotated:");
        if(sc.hasNextInt()){
            d=sc.nextInt();
        }
        if(d>n){
            d=d%n;
        }
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        //shifting
        for(int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        for(int i=n-d; i<n;i++)
        {
            arr[i]=temp[i-n+d];
        }
        System.out.println("Rotated array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
