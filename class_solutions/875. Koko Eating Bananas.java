class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n=piles.length;
        int low = 1;
        int right = piles[n - 1];

        while (low <= right) { 
            int mid = low + (right - low) / 2;
            if (istrue(mid, piles, h, n)) {
                right = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean istrue(int mid, int[] piles, int h,int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double) piles[i] / mid);
        }
        return sum <= h;
    }
}
