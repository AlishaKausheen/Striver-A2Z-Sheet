public class LongestRepeatingCharacterReplacement {
    public int optimal(String s, int k) {
        int left =0,right=0, maxLength=0,maxFrequency=0;
        int[] hash = new int[26];
        while(right<s.length()){
            hash[s.charAt(right)-'A']++;
            maxFrequency= Math.max(maxFrequency,  hash[s.charAt(right)-'A']);
            while((right-left+1)-maxFrequency>k){
                hash[s.charAt(left)-'A']--;

                left++;
            }

            maxLength = Math.max(maxLength,right-left+1);


            right++;
        }
        return maxLength;
    }
}
