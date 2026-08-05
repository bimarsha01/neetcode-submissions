class Solution {
    public int mySqrt(int x) {

        // Special cases
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Use long to avoid integer overflow
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }
            else if (square < x) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        // When the loop ends,
        // right is the floor(sqrt(x))
        return right;
    }
}