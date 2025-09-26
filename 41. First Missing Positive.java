//brute force apporach

import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return nums.length+1;

//best optimized apporach
        int n = nums.length;

        // out of bounds 
        for(int i = 0; i<n; i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i] = n + 1;
            }
        }

        // Marking
        for(int i = 0;i<n;i++){
            int num = Math.abs(nums[i]);
            if (num > n) {
                continue;
            }
            num--;
            if (nums[num] > 0) {
                nums[num] = -1 * nums[num];
            }
        }

        // answer
        for(int i = 0;i<n;i++){
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n+1;
    }
}

