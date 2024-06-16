import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s ="add";
        String t = "egg";
    }
    static boolean approach(String s, String t){
        if (s.length()!= t.length()){
            return false;
        }
        HashMap<Character,Character> mp1 = new HashMap<>();
        HashMap<Character,Boolean> mp2 = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (mp1.containsKey(ch1)){
                if(mp1.get(ch1)!=ch2){
                    return false;
                }
            }else {
                if (mp2.containsKey(ch2)){
                    return false;
                }else {
                    mp1.put(ch1,ch2);
                    mp2.put(ch2,true);
                }
            }
        }

        return true;
    }
    static boolean optimal(String s, String t){
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map= new HashMap<>();
        for (int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement =t.charAt(i);
            if (!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original,replacement);
                }else {
                    return false;
                }
            }else {
                char mapChar = map.get(original);
                if (mapChar != replacement)
                    return false;
            }
        }

        return true;
    }
}
