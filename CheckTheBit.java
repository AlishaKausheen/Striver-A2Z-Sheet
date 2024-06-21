public class CheckTheBit {
    public static void main(String[] args) {

        //bit start from 0
        int n=4,k=0;
    }
    static boolean checkKthBit(int n, int k)
    {
        int x = n&(1<<k);
        // Your code here
        if(x !=0){
            return true;
        }
        return false;
    }
}
