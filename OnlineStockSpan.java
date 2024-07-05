import java.util.ArrayList;
import java.util.Stack;

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
    class optimal {
        Stack<int[]> stack;
        public optimal() {
            stack = new Stack<>();
        }

        public int next(int price) {
            int span =1;
            while(!stack.isEmpty() && stack.peek()[0]<=price){
                span += stack.pop()[1];
            }
            stack.push(new int[]{price, span});
            return span;
        }
    }
}
