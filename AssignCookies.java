import java.util.Arrays;
//tc: o(nlogn+mlogm+m)
public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,5,3,3,4};
        int[] s = {4,2,1,2,1,3};
        System.out.println(maxAssign(g,s));

    }
    static int maxAssign(int[] g, int[] s){
        Arrays.sort(s);
        Arrays.sort(g);
        int l=0, r=0;
        while (l<s.length && r<g.length){
            if(g[r]<=s[l]){
                r=r+1;
            }
            l=l+1;
        }
        return r;
    }
}
