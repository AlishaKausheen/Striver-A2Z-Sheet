public class SmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        int[] nums ={1,2,5,9};
        int threshold =6;
        System.out.println(brute(nums,threshold));
        System.out.println(optimal(nums,threshold));

    }

    public static int max(int[] nums){
        int maxi = Integer.MIN_VALUE;

        for (int i=0;i< nums.length;i++){
            maxi =Math.max(maxi,nums[i]);
        }
        return maxi;
    }

    static int brute(int[] nums, int threshold){

        for (int d=1;d<=max(nums);d++){
            int sum=0;
            for (int i=0;i< nums.length;i++){
                sum+= Math.ceil((double)nums[i]/d );
            }
            if (sum<=threshold){
                return d;
            }
        }
        return -1;
    }
    static int optimal(int[] nums, int threshold){
           int ans =-1;
        int low = 1, high = max(nums);
        while (low<=high){
            int mid = low+(high-low)/2;
            if(sumOfDivision(nums,mid)<=threshold){
                ans= mid;
                high=mid-1;
            }else {
                low=mid+1;
            }

        }
        return ans;
    }

    public static int sumOfDivision(int[] nums, int d){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum+=Math.ceil((double) nums[i]/d);
        }
        return sum;
    }
}
