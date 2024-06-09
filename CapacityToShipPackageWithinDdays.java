public class CapacityToShipPackageWithinDdays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days =5;
        System.out.println(brute(weights,days));
        System.out.println(optimal(weights,days));

    }
    public static int startRange(int[] weights){
        int maxi=Integer.MIN_VALUE;
        for (int i=0;i<weights.length;i++){
            maxi= Math.max(maxi, weights[i]);
        }
        return maxi;
    }
    public static int endRange(int[] weights){
        int sum=0;
        for (int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        return sum;
    }
    public static int noOfdays(int[] weights, int capacity){
        int dayCount=1;
        int sumOfweights=0;
        for (int i=0;i< weights.length;i++){

            if(sumOfweights+weights[i]>capacity){
                dayCount+=1;
                sumOfweights=weights[i];
            }else {
                sumOfweights+=weights[i];
            }
        }
        return dayCount;
    }
    static int brute(int[] weights, int days){
        for (int i= startRange(weights);i<=endRange(weights);i++){
            int daysReq=noOfdays(weights, i);
            if (daysReq<=days){
                return i;
            }
        }
        return -1;
    }
    static int optimal(int[] weights, int days){
        int ans =-1;
        int low = startRange(weights), high = endRange(weights);
        while (low<=high){
            int mid = low+(high-low)/2;
            int daysReq = noOfdays(weights,mid);
            if(daysReq<=days){
                ans = mid;
                high =mid-1;
            }else {
                low =mid+1;
            }
        }

        return ans;
    }
}
