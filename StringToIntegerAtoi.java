public class StringToIntegerAtoi {
    public int Approach1(String s) {
        if(s.length()==0) return 0;
        int i=0;
        while(i<s.length() && s.charAt(i)==' ') {i++;}
        if(i>=s.length()) return 0;
        int sign =1;
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            sign = (s.charAt(i)=='+')?1:-1;
            i++;
        }
        if(i>=s.length()) return 0;
        int res=0;
        for( ;i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9' ;i++){
            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && s.charAt(i)-'0'> Integer.MAX_VALUE %10))

                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            res=res*10+ (s.charAt(i)-'0');
        }
        return res*sign;
    }
}
