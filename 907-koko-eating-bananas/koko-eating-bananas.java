class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int t=0;
        while(low<high){
            int mid = (low+high)/2;
            t=0;
            for(int x:piles){
                t = t+(int)Math.ceil((double)x/mid);
            }
            if(t<=h){
                high = mid;
            }else{
                low = mid+1;
            }
            

        } 
        return low;
        
    }
}