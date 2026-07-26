class Solution {
    public String longestCommonPrefix(String[] strs) {
      String firstword = strs[0];
        int j = firstword.length();

        String result = "";

        for (int k = 0; k < j; k++) {
            char currentChar = firstword.charAt(k);

            for (int b = 1; b < strs.length; b++) {
                if (k >= strs[b].length() || strs[b].charAt(k) != currentChar) {
                    // System.out.println(result);
                    return result;
                }
            }
            result += currentChar;
        }

        return result;
    }
    }
