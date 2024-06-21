public class BitManipulation {
    public static void main(String[] args) {
        int num=70,i=3;
    }
   //bits starts from 1
    static int getbit(int num, int i){


        int n= (num>>(i-1))&1;
        return n;
    }
    static int setbit(int num,int i){
        int k=1<<(i-1);
        int d=num|k;
        return d;
    }
    static int clearbit(int num, int i){
        int k=1<<(i-1);
        int f=(~k&num);
        return f;
    }
}
