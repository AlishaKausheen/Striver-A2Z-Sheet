public class MinimumBitFlipsToConvertANumber {
    public static void main(String[] args) {

    }
    static int brute(int start, int goal){
        int ans = start^goal;
        int count =0;
        for(int i=0;i<=31;i++){

            if((ans & (1<<i))!=0){
                count++;
            }
        }
        return count;
    }
}
