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

//this is the full and optimal sol of this problem using tht priority queue 
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // max-heap storing [value, index]
        PriorityQueue<int[]> list = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        int n = nums.length;
        int[] result = new int[n - k + 1];

        // first add the first k elements
        for (int i = 0; i < k; i++) {
            list.add(new int[]{nums[i], i});
        }
        result[0] = list.peek()[0]; // max of first window

        // slide the window
        for (int i = k; i < n; i++) {
            // add new element
            list.add(new int[]{nums[i], i});

            // remove elements outside the current window
            while (list.peek()[1] <= i - k) {
                list.poll();
            }

            // max of current window
            result[i - k + 1] = list.peek()[0];
        }

        return result;
    }
}
