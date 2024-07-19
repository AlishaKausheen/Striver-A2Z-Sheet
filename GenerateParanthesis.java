import java.util.ArrayList;

public class GenerateParanthesis {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        solve("",0,0,n,ans);
        return ans;
    }
    private void solve(String current, int open,int close, int total, ArrayList<String> ans){
        if(current.length()==2*total){
            ans.add(current);
            return;
        }
        if(open<total){
            solve(current+"(",open+1,close,total, ans);
        }
        if(close<open){
            solve(current+")", open, close+1, total, ans);
        }
    }

}
