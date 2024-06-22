public class XorWithinARange {
    public static void main(String[] args) {

    }
    static int approach(int l, int r){
        int xor1=xor(l-1);
        int xor2 =xor(r);

        return xor1^xor2;
    }
    public static int xor(int n){
        if(n%4==1) return 1;
        if (n%4==2) return n+1;
        if (n%4==3) return 0;
        return n;
    }
}
