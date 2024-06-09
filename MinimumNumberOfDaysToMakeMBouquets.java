public class MinimumNumberOfDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {7,7,7,7,13,11,12,7};
        int m=2;
        int k=3;//number of adjcent flowers to put in one bouquet
            System.out.println(brute(bloomDay,m,k));
            System.out.println(optimal(bloomDay,m,k));
    }

    public static int min(int[] bloomDay){
        int min=Integer.MAX_VALUE;
        for (int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
        }
        return min;
    }
    public static int max(int[] bloomDay){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
        }
        return max;
    }

    public static boolean possible(int[] bloomDay, int day, int m , int k){
        int noOfBoq =0;
        int count =0;
        for (int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
            }else {
                noOfBoq+=(count/k);
                count=0;
            }
        }

        noOfBoq += (count / k);
        return noOfBoq >= m;
    }
    static int brute(int[] bloomDay, int m, int k){
        if(m*k>bloomDay.length){
            return -1;
        }

        int mini = min(bloomDay);
        int maxi= max(bloomDay);
        for (int i=mini;i<=maxi;i++){
            if(possible(bloomDay,i,m,k)){
                return i;
            }
        }

        return -1;
    }
    static int optimal(int[] bloomDay, int m, int k){
        if(k*m>bloomDay.length){
            return -1;
        }
        int ans =-1;
        int low = min(bloomDay), high = max(bloomDay);
        while (low<=high){
            int mid= low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }

        return ans;
    }

}
