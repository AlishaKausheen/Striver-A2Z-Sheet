public class OddOrEven {
    public static void main(String[] args) {
        int N=5;
    }
    static String oddEven(int N){
        // code here
        String ans ="even";
        int x= N&1;
        if(x!=0){
            ans="odd";
        }
        return ans;
    }
}
