public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";

    }
    static boolean approach1(String s, String goal){
        return (s.length()==goal.length() && (s+s).contains(goal));
    }
}
