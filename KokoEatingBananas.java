public class KokoEatingBananas {
    public static void main(String[] args) {
    int[] piles ={3,6,7,11};
    int h=8;
    System.out.println(brute(piles,h));
    System.out.println(optimal(piles,h));
    }

    static  int brute(int[] piles, int h){
        int maxi=max(piles);
        for (int i=1;i<=maxi;i++){
            int reqTime = totalHour( piles, i);
            if(reqTime<=h){
                return i;
            }
        }

        return maxi;
    }

    public static int max(int[] piles){
        int maxi =0;
        for (int i=0;i< piles.length;i++){
            maxi = Math.max(maxi,piles[i]);
        }
        return maxi;
    }
    public static int totalHour(int[] piles, int hourly){
        int total=0;
        for (int i=0;i< piles.length;i++){
            total+= Math.ceil((double)piles[i]/(double) hourly);
        }
        return total;
    }

    static int optimal(int[] piles, int h){
        int low =1, high = max(piles);
        int ans = Integer.MAX_VALUE;
        while (low<=high){
            int mid = low +(high-low)/2;
            int reqTime = totalHour(piles,mid);
            if(reqTime<=h){
                ans = mid;
                high = mid-1;
            }else {
                low =mid+1;
            }
        }
        return ans;
    }

}
