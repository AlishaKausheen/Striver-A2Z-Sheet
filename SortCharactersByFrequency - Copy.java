import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";
    }
    static String approach1(String s){
        StringBuilder ans = new StringBuilder();
        HashMap<Character,Integer> hm = new HashMap<>();
        ArrayList<Character>[] arr = new ArrayList[s.length()+1];
        for (char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        hm.keySet().forEach(
         c->{
             if (arr[hm.get(c)]==null){
                 arr[hm.get(c)]= new ArrayList<>();
             }
             arr[hm.get(c)].add(c);
         }
        );
        for (int i=arr.length-1;i>0;i--){
            if (arr[i]!=null){
                for (Character c:arr[i]){
                    for (int j=0;j<i;j++){
                         ans.append(c);
                    }
                }
            }
        }
        return ans.toString();
    }
}
