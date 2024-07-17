public class CountGoodNumbers {
    private long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long first = solve(5, even)%mod;
        long second = solve(4,odd)%mod;
        return (int)((first*second)%mod);
    }
    public long solve(long x, long n){

        if(n==0) return 1;
        long temp = solve(x,n/2);

        if(n%2==0)  return (temp*temp)%mod;


        return    ( x *temp*temp)%mod;

    }
}
