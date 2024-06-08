public class NthRootOfM {
    public static void main(String[] args) {
          System.out.println(brute(3,125));
        System.out.println(optimal(3,125));
    }
    static int brute(int n, int m){
        for (int i = 1; i <= m; i++) {
            long val = func(i, n);
            if (val == (long)m) return i;
            else if (val > (long)m) break;
        }


        return -1;
    }

    public static long func(int b, int exp) {
        long  ans = 1;
        long base = b;
        while (exp > 0) {
            if (exp % 2 == 1) {
                exp--;
                ans = ans * base;
            } else {
                exp /= 2;
                base = base * base;
            }
        }
        return ans;
    }
    static int optimal(int n, int m){

        int low =1, high =m;
        while (low<=high){
            int mid = low +(high-low)/2;

            if(func(mid,n)== m){
                return  mid;
            } else if (func(mid,n)<m) {
                low=mid+1;
            }else {
                high = mid-1;
            }
        }

        return -1;
    }
}
