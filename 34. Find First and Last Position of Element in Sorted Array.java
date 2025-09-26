//we have used binary search here becuz we have to do this in 0(log n)
//we will first find the first index in left part and continue  to find this it even if it exist becauz maybe more than one target element is there
// the same goes for right part
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans1 = -1;
        int ans2 = -1;

        // find leftmost index
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans1 = mid;
                right = mid - 1; // keep going left
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // reset boundaries!
        left = 0;
        right = nums.length - 1;

        // find rightmost index
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans2 = mid;
                left = mid + 1; // keep going right
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{ans1, ans2};
    }
}
