class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st= new Stack<>();
        for(int i=prices.length-1;i>=0;i--){
            if(st.isEmpty()) st.push(prices[i]);
            else{
                int t=prices[i];
                if(st.peek()>prices[i]){
                    while(!st.isEmpty() && st.peek()>prices[i]) st.pop();
                    if(st.isEmpty()) st.push(prices[i]);
                    else{
                        prices[i]-=st.peek();
                        st.push(t);
                    }
                } else{
                    prices[i]-=st.peek();
                    st.push(t);
                }
            }
        }
        return prices;
    }
}