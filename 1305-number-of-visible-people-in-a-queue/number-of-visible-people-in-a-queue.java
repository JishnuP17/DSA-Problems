class Solution {
    public int[] canSeePersonsCount(int[] h) {
        int res[] = new int[h.length];
        Stack<Integer> s = new Stack<>();
        for(int i=h.length-1;i>=0;i=i-1){
            while(!s.isEmpty() && h[s.peek()]<h[i]){
                res[i] = res[i]+1;
                s.pop();
            }
            if(!s.isEmpty()){
                res[i] = res[i]+1;
            }
            s.push(i);
        }
        return res;
        
    }
}