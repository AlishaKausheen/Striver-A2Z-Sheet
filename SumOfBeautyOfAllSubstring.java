import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SumOfBeautyOfAllSubstring {
    public static void main(String[] args) {
        String s = "aabcb";
    }
    static int approach1(String s){

        int ans=0;
        for (int i=0;i<s.length();i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j=i;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                int max=Integer.MIN_VALUE;
                int  min= Integer.MAX_VALUE;
                for (HashMap.Entry<Character, Integer> entry : map.entrySet()){
                    max=Math.max(max,entry.getValue());
                    min=Math.min(min,entry.getValue());
                }
                ans+=(max-min);
            }
        }
        return ans;
    }
}
