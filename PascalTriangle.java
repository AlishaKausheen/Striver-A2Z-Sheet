import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(variety1(10,3));
        System.out.println(variety2(5));
        System.out.println(variety2better(5));
        ArrayList<ArrayList<Integer>> ans = variety3(5);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
    }

    //finding particular element if row and column given
    //take for 0
    //take r= R-1 c=C-1 if not starting from 0
   public static int variety1(int r , int c){
        int res=1;
        for (int i=0;i<c;i++){
            res=res*(r-i);
            res = res/(i+1);
        }
        return res;
    }
    //to print whole row
    //tc:o(n*r)
  public   static boolean variety2(int r){
        for (int c=1;c<=r;c++){
            System.out.println(variety1(r-1,c-1));
        }
        return true;
    }
  public static boolean variety2better(int r){

        int ans=1;
        System.out.println(ans);
        for (int i=1;i<r;i++){
            ans= ans*(r-i);
            ans = ans/i;
            System.out.println(ans);
        }
        return true;
  }

  //print the entire pascal triangle till r row
        static ArrayList<ArrayList<Integer>> variety3(int r){
            ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
            for (int row = 1; row <= r; row++) {
                ArrayList<Integer> tempLst = new ArrayList<>(); // temporary list
                for (int col = 1; col <= row; col++) {
                    tempLst.add(variety1(row - 1, col - 1));
                }
                ans.add(tempLst);
            }
            return ans;
        }
}
