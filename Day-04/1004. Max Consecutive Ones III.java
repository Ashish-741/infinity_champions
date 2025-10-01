
//this is one of the apporaches i can think of but it still is not optimized beacuse list takes 0(n) times is adding and removing
class Solution {
    public int longestOnes(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int high = 0;
        int countzero = 0;
        int maxLen = 0;

        while (high < n) {
            if (nums[high] == 1) {
                list.add(nums[high]);
            } else {
                countzero++;
                list.add(nums[high]);
                while (countzero > k) {
                    int removed = list.remove(0);
                    if (removed == 0) {
                        countzero--;
                    }
                }
            }
            maxLen = Math.max(maxLen, list.size());
            high++;
        }

        return maxLen;
    }
}



//here we dont have any list ,we just have used two pointer

class Solution {
    public int longestOnes(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int low=0;
        int countzero = 0;
        int maxlen = 0;
        for(int high=0;high<n;high++){
            if(nums[high]==0){
                countzero++;
            }
            while(countzero>k){
                if(nums[low]==0){
                    countzero--;
                }
                low++;
            }
            maxlen=Math.max(maxlen,high-low+1);
        }
        return maxlen;
    }
}

