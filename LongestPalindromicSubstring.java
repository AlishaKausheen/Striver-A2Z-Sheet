public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
    }
    public static boolean isPalindrome(String s, int i, int j){
        while (i<j){
            char ch1 =s.charAt(i);
            char ch2 =s.charAt(j);
            if (ch1!=ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static String approach1(String s){
        int max=0,start=0,end=0;
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if (isPalindrome(s,i,j)){
                    if ((j-i+1)>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
    static String optimal(String s){
        if (s.length()<=1){
            return s;
        }
        String lps="";
        for (int i=1;i<s.length();i++){
            int low =i,high=i;
            while (s.charAt(low)==s.charAt(high)) {
                low--;
                high++;
                if (low == -1 || high == s.length()) {
                    break;
                }
            }
                String palindrome = s.substring(low+1,high);
                if (palindrome.length()>lps.length()){
                    lps= palindrome;
                }
                low = i-1;
                high=i;
                while (s.charAt(low)==s.charAt(high)){
                    low--;
                    high++;
                    if (low==-1|| high==s.length()){
                        break;
                    }
                }
                palindrome =s.substring(low+1,high);
                if (palindrome.length()>lps.length()){
                    lps =palindrome;
                }
            }
        return lps;
    }
}
