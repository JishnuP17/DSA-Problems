class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 0;
        }
        int l =0;
        int mid;
        int h = n-1;
        while(l<h){
            mid = (l+h)/2;
            if(nums[mid]>nums[mid+1]){
                h = mid;
            }else{
                l = mid+1;
            }

        }
        return l;
        
    }
}