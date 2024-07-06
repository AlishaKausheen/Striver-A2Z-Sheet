import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right =0;
        HashSet<Character> set = new HashSet<>();
        int maxi=0;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(set.add(ch)){
                maxi = Math.max(maxi, right-left+1);
                right++;
            }else{
                while(s.charAt(left)!=ch){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(ch);
                left++;
            }
        }
        return maxi;
    }
}
