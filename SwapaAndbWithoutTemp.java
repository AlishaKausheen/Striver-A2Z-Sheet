import java.util.ArrayList;

public class SwapaAndbWithoutTemp {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> approach(int a, int b){
        ArrayList<Integer> list = new ArrayList<>();
        a =a^b;
        b=a^b;
        a=a^b;
        list.add(a);
        list.add(b);
        return list;
    }
}
