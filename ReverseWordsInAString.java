public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = " the sky is blue ";
        System.out.println(approach1(s));
        System.out.println(optimal(s));
    }
    static String approach1(String s){
        String ans ="";
        for (int i=0;i<s.length();i++){
            StringBuilder sb = new StringBuilder();
            while (i<s.length() && s.charAt(i) != ' '){
                sb.append(s.charAt(i));
                i++;
            }
            if (sb.length() !=0){
                ans = " "+ sb+ans;
            }
        }

        return ans.substring(1);
    }
    static String optimal(String s){
        int left = 0;
        int right =s.length()-1;
        String temp = "";
        String ans = "";
        while (left<=right){
            char ch = s.charAt(left);
            if (ch!=' '){
                temp+=ch;
            } else if (ch==' ') {
                if(!ans.equals("")){
                    ans = temp+" "+ans;
                }else {
                    ans =temp;
                }
                temp="";
            }
            left++;
        }
        if (!temp.equals(""))
        {
            if (!ans.equals(""))
            {
                ans = temp + " " + ans;
            }
            else
            {
                ans = temp;
            }
        }
        return  ans;
    }

}
