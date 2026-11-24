class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[i] = 0;
        }
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<heights[i]){
                st.pop();
                arr[i] = arr[i]+1;
            }
            if(!st.isEmpty()){
                arr[i] = arr[i]+1;
            }
            st.push(heights[i]);
        }
        return arr;
    }
}