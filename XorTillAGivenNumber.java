public class XorTillAGivenNumber {
    public static void main(String[] args) {

    }
    //without using loop
    static int approach(int n){
        if(n%4==1) return 1;
        if (n%4==2) return n+1;
        if (n%4==3) return 0;
        return n;
    }
}
