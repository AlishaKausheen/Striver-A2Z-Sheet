public class PowerXN {

    public double Approach1(double x, int n) {
        double ans = 1.0;
        long pow=n;
        if(pow<0) pow =-1*pow;
        while(pow>0){
            if(pow%2==0){
                x=x*x;
                pow=pow/2;
            }else{
                ans = ans*x;
                pow=pow-1;
            }
        }
        if(n<0) ans = (double)(1.0)/(double)(ans);
        return ans;
    }
    public double myPow(double x, int n) {
        return solve(x, (long)n);
    }
    public double  solve(double x, long n){
        if(x==1) return 1;
        if(n==0) return 1;
        if(n<0) return solve(1/x, -n);
        if(n%2==0)  return solve(x*x, n/2);


        return     x * solve(x*x, (n-1)/2);

    }

}
