class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length-k+1;
        int res[] = new int[n];
        int l = 0;
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(dq.peekFirst()<l){
                dq.pollFirst();
            }
            
            if(i-l+1==k){
                res[l] = nums[dq.peekFirst()];
                l++;
            }
        }
        return res;
        
    }
}