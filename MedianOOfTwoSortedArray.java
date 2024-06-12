import java.util.ArrayList;

public class MedianOOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,3,4,7,10,12};
        int[] arr2 = {2,3,6,15};
        System.out.println(brute(arr1,arr2));
        System.out.println(better(arr1,arr2));
    }

    static double brute(int[] arr1, int[] arr2){
        ArrayList<Integer> arr3 = new ArrayList<>();
        double median;
        int i=0,j=0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3.add(arr1[i]);
                i++;
            }else {
                arr3.add(arr2[j]);
                j++;
            }
        }
        while (i<arr1.length){
            arr3.add(arr1[i]);
            i++;
        }

        while (j<arr2.length){
            arr3.add(arr2[j]);
            j++;
        }
        int n= arr1.length+arr2.length;
        if(n%2==1){
            median = arr3.get(n/2);
        }else {
            median = ((double) arr3.get(n / 2) + (double) arr3.get((n / 2) - 1)) / 2.0;
        }
 return median;
    }
static double better(int[] arr1, int[] arr2){
        double median =0;

        int n= arr1.length+ arr2.length;
        int i=0,j=0;
        int count=0;
        int index1=n/2,index2=n/2-1;
        int ind1ele=-1,ind2ele=-1;
        while (i<arr1.length&& j<arr2.length){
            if (arr1[i]<arr2[j]){
                if (count==index1)
                    ind1ele=arr1[i];
                if (count==index2)
                    ind2ele=arr1[i];
                count++;
                i++;
            }else {
                if (count==index1)
                    ind1ele=arr2[j];
                if (count==index2)
                    ind2ele=arr2[j];
                count++;
                j++;
            }
        }
        while (i<arr1.length){
            if (count==index1) ind1ele=arr1[i];
            if (count==index2) ind2ele=arr1[i];
            i++;
            count++;
        }
    while (j<arr2.length){
        if (count==index1) ind1ele=arr2[j];
        if (count==index2) ind2ele=arr2[j];
        j++;
        count++;
    }
    if (n%2==1){
        median= ind2ele;
    }else {
        median = (double)(ind1ele+ind2ele)/2.0;

    }

        return median;
}
}
