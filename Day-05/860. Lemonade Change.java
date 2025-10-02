class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length-1;
        int slow=0;
        int five=0;
        int ten=0;
        while(slow<=n){
            if(bills[slow]==5){
                five++;
                slow++;
            }else if(bills[slow]==10){
                if(five==0){
                    return false;
                }
                ten++;
                five--;
                slow++;
            }else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                    slow++;
                }else if(five>=3){
                    five-=3;
                    slow++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
