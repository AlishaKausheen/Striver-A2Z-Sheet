import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
    }
    static int approach1(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        if (s==null || s.length()==0){
            return 0;
        } map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result =0;
        result = map.get(s.charAt(s.length()-1));
        for (int i=s.length()-2;i>=0;i--){
            if (map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                result -=map.get(s.charAt(i));
            }else {
                result+=map.get(s.charAt(i));
            }
        }
        return result;
    }
    public static int getVal(char ch){
        switch (ch){
            case 'I':return 1;
            case 'V': return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M' : return 1000;
            default:return 0;
        }
    }
    static int approach2(String s){
        int sum=getVal(s.charAt(s.length()-1));
        for (int i=s.length()-2;i>=0;i--){
            if(getVal(s.charAt(i))<getVal(s.charAt(i+1))){
                sum-=getVal(s.charAt(i));
            }else {
                sum+=getVal(s.charAt(i));
            }
        }
        return sum;


    }
}
