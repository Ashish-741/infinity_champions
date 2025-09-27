//in this we have keep the track of both minimum price to buy and the maximum profit
class Solution {
    public int maxProfit(int[] prices) {
        int mini=Integer.MAX_VALUE;//minimum price
        int max=0;
        for(int i:prices){
            mini=Math.min(i,mini);
            max=Math.max(max,i-mini);
        }
        return max;

    }
}
