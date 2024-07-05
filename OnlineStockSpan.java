import java.util.ArrayList;

public class OnlineStockSpan {
    class brute {
        ArrayList<Integer> prices;

        public brute() {
            prices = new ArrayList<>();
        }

        public int next(int price) {
            prices.add(price);
            int span = 1;
            for(int i=prices.size()-2;i>=0;i--){
                if(prices.get(i)<=price){
                    span+=1;
                }else{
                    break;
                }
            }
            return span;
        }
    }
}
