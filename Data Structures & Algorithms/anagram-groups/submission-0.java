class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String s : strs) {

            int[] size = new int[26];

            for(char c : s.toCharArray()){
                size[c - 'a']++;
            }
                String str = Arrays.toString(size);
                hashMap.putIfAbsent(str , new ArrayList<>());
                hashMap.get(str).add(s);
        }

        return new ArrayList<>(hashMap.values());
    }
}
