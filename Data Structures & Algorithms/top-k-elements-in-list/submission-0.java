class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer , Integer> topk = new HashMap<>();

        for(int keys : nums){
            topk.put(keys , topk.getOrDefault(keys , 0) +1);
        }
        PriorityQueue<Map.Entry<Integer , Integer>>heap = new PriorityQueue<>((a,b)->a.getValue() - b.getValue());
        for(Map.Entry<Integer , Integer> entry : topk.entrySet()){
            heap.offer(entry);

            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] res = new int[k];
        int index = 0;

        while(!heap.isEmpty()){
            res[index++] = heap.poll().getKey();

        }
        return res;
    }
}
