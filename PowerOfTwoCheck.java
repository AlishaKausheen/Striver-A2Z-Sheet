public class PowerOfTwoCheck {
    public static void main(String[] args) {
        int n=13;
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        if(n<0){
            return false;
        }
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
}
