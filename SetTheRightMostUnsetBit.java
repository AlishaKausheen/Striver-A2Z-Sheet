public class SetTheRightMostUnsetBit {
    public static void main(String[] args) {

    }
    static int approach1(int n){
        if ((n & (n + 1)) == 0)
            return n;

        // else
        return n | (n + 1);
    }
}
