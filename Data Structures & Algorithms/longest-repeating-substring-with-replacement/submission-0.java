class Solution {
    public int characterReplacement(String string, int k) {
         int left = 0;
        int maxLength = 0;
        int maxFreq = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < string.length(); right++) {

            char c = string.charAt(right);

            map.put(c, map.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(c));

            int windowSize = right - left + 1;

            int replacement = windowSize - maxFreq;

            if(replacement > k) {

                char leftChar = string.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
