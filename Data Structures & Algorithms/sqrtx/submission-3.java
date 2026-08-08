class Solution {
    public int mySqrt(int x) {

 int left = 1;
        int right = x;
        int maximumMid = 0;

        while (left <= right) {

            int currentMid = left + (right - left) / 2;

            long sqrtMid = (long) currentMid * currentMid;

            if (sqrtMid > x) {
                right = currentMid - 1;
            }
            else {
                maximumMid = currentMid;
                left = currentMid + 1;
            }
        }

        return maximumMid;

    }
}