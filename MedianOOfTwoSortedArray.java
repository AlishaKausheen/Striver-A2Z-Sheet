import java.util.ArrayList;

public class MedianOOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,3,4,7,10,12};
        int[] arr2 = {2,3,6,15};
        System.out.println(brute(arr1,arr2));
        System.out.println(better(arr1,arr2));
        System.out.println(optimal(arr1,arr2));
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
static double optimal(int [] a , int[] b){
    int n1 = a.length, n2 = b.length;
    //if n1 is bigger swap the arrays:
    if (n1 > n2) return optimal(b, a);

    int n = n1 + n2; //total length
    int left = (n1 + n2 + 1) / 2; //length of left half
    //apply binary search:
    int low = 0, high = n1;
    while (low <= high) {
        int mid1 = (low + high) / 2;
        int mid2 = left - mid1;
        //calculate l1, l2, r1 and r2;
        int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
        int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
        int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
        int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

        if (l1 <= r2 && l2 <= r1) {
            if (n % 2 == 1) return Math.max(l1, l2);
            else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
        } else if (l1 > r2) high = mid1 - 1;
        else low = mid1 + 1;
    }
    return 0;
}
}
