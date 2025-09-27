//this is the brute force i can think of but it doesn't pass all the test cases

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int left = 0, right = k - 1;

        while (right < nums.length) {
            int max = maxval(left, right, nums);
            arr.add(max);
            left++;
            right++;
        }

        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }

    private static int maxval(int left, int right, int[] nums) {
        int max = nums[left];
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }
}