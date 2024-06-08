public class FindSquareRoot {
    public static void main(String[] args) {
        System.out.println(brute(28));
        System.out.println(optimal(28));
    }
    static int brute(int n){
        int ans =1;
        for (int i=1;i<=n;i++){
            if (i*i<=n){
                ans =i;
            }else {
                break;
            }
        }
        return ans;
    }
    static  int optimal(int n){
        int ans =1;
        int low =1, high = n;
        while (low<=high){
            int mid = low +(high-low)/2;
            if (mid*mid<=n){
                ans = mid;
                low =mid+1;
            }else {
                high = mid-1;
            }
        }

        return ans;
    }
}
