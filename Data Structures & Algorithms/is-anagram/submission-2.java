class Solution {
    public boolean isAnagram(String s, String b) {
         HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(hashMap);


        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            hashMap2.put(c, hashMap2.getOrDefault(c, 0) + 1);
        }

        System.out.println(hashMap2);

boolean finalres = hashMap2.equals(hashMap);
       return finalres;
    }
}
