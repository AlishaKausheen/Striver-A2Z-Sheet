import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
    }
    static boolean approach1(String s, String t){
      if (s.length()!=t.length()){
          return false;
      }
      s=sort(s);
      t=sort(t);
      for (int i=0;i<s.length();i++){
          if(s.charAt(i)!=t.charAt(i)){
              return false;
          }
      }
return true;
    }
    public static String sort(String s){
        char[] ch= s.toCharArray();
        Arrays.sort(ch);
        return ch.toString();
    }
    static boolean optimal(String s, String t){
        if (s.length() != t.length())
            return false;

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'A']++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'A']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
}
