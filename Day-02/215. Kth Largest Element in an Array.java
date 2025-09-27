class Solution {
    public int findKthLargest(int[] nums, int k) {
        //this is the first sol i can think of using min heap
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int i:nums){
            heap.add(i);
            if(heap.size()>k){
                heap.poll();
            }
        }
        return heap.peek();
    }
}