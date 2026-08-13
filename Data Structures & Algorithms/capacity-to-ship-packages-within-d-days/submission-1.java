public class Solution {
    public int shipWithinDays(int[] weights, int days) {
          int totalWeight = Arrays.stream(weights).sum();
        int maxWeight = Arrays.stream(weights).max().getAsInt();
        int l = maxWeight;
        int r = totalWeight;
        int res = maxWeight;


        while(l<=r){
            int currentWeight = 0;
            int daysNeeded = 1;

            int k = l + (r - l) / 2;

            for (int weight : weights) {

                if (currentWeight + weight > k) {
                    daysNeeded++;
                    currentWeight = weight;
                } else {
                    currentWeight += weight;
                }
            }

            if(daysNeeded<=days){
                res = k;
                r = k-1;
            }
            else{
                l = k+1;
            }

        }

        return res;
    }
}