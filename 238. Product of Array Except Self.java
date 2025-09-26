//In this question we have used two array prefix and suffix ,in suffix we have stored the product before the element 
// and in prefix we have stored the product after the element ,then after this finally we have product the prefix and suffix for a given element .
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] suffix=new int[nums.length];
        int[] prefix=new int[nums.length];
        suffix[0]=1;
        prefix[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            suffix[i]=suffix[i-1]*nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            prefix[j]=prefix[j+1]*nums[j+1];
        }
        for(int k=0;k<nums.length;k++){
            nums[k]=prefix[k]*suffix[k];
        }
        return nums;
    }
}
