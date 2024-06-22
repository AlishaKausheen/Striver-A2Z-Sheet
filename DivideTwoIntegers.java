public class DivideTwoIntegers {
    public static void main(String[] args) {

    }
    static int brute(int divident, int divisor){
        int sum=0,count=0;
        if (divident==divisor) return 1;

        while (sum+divisor<=divident){
            count+=1;
            sum+=divisor;
        }
        return count;
    }
    static int better(int dividend, int divisor){
        boolean sign=true;
        if (dividend==divisor) return 1;
        if (dividend>=0 && divisor<0) sign =false;
        if (dividend<0 && divisor>0) sign=false;
        int n= Math.abs(dividend),d =Math.abs(divisor);
        int ans=0;
        while(n>=d){
            int count=0;
            while (n>=(d<<(count+1)))
                count++;
            ans+=(1<<count);
            n=n-(d*(1<<count));
        }
        if (ans>=Integer.MAX_VALUE && sign==true){
            return Integer.MAX_VALUE;
        }
        if (ans<=Integer.MIN_VALUE && sign==false){
            return Integer.MIN_VALUE;
        }
        return sign?ans:(-1*ans);

    }
}
