import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
    String[]  strs = {"flower","flow","flight"};

    }
    static String bruteForce(String[] strs){
             String ans =strs[0];
              for (int i=1;i<strs.length;i++){
                  ans=common(ans,strs[i]);
              }
              if (ans.isEmpty()){
                  return "";
              }
        return ans;
    }
    public static String common(String s1, String s2){
        int min =Math.min(s1.length(),s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<min;i++){
            if(s1.charAt(i)== s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();
    }
    static String optimal(String[] strs){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        for (int i=0;i< first.length;i++){
            if (first[i]!=last[i]){
                break;
            }
            sb.append(first[i]);
        }
        return sb.toString();
    }
}
