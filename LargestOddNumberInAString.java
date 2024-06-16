public class LargestOddNumberInAString {
    public static void main(String[] args) {
        String s = "527708";
        System.out.println(approach1(s));
    }
    static String approach1(String s){
        for (int i= s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch%2==1){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}
