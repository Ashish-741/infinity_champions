//this is a simple question , the no we are finding must be in between  1 to n ,so it is a very simplem problem with binary search
public boolean isPerfectSquare(int num) {
    int low = 0;
    int high = num;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        long sum = (long) mid * mid;  
        if (sum == num) {
            return true;
        } else if (sum > num) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return false;
}
