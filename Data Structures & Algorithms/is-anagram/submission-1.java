class Solution {
    public boolean isAnagram(String s, String t) {
         s = s.toUpperCase();
        t = t.toUpperCase();

        int[] arr = new int[256];
        boolean anag = true;

        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i) - 'A']++;
        }

        for(int i = 0;i<t.length();i++){
            arr[t.charAt(i) - 'A']--;
        }

        for(int i = 0 ;i < arr.length; i++){
            if(arr[i] > 0 || arr[i] < 0){
                anag = false;
            }
        }

        return anag;
    }
}
