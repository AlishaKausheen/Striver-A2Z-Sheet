import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeroesToTheEnd {
    public static void main(String[] args) {
        int[] arr= {1,0,2,5,0,0,5,4,7,9,0};
       System.out.println(Arrays.toString(brute(arr)));
       System.out.println(Arrays.toString(optimal(arr)));
    }
    //brute
    //tc: o(n+x+n-x) sc: O(x)
    static int[] brute(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        for(int i=0;i< list.size();i++){
            arr[i]= list.get(i);
        }
        for(int i= list.size();i< arr.length;i++){
            arr[i]=0;
        }
        return arr;
    }

    //Opimal solution
    //tc:o(n+x) sc:o(1)
    static int[] optimal(int[] arr){
        int j=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for (int i=j+1;i< arr.length;i++){
            if(arr[i]!=0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
}
