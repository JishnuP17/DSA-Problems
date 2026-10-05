class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> v;
        if(nums.empty()){
            return {-1,-1};
        }
        int n = nums.size()-1;
        int l =0;
        int h = n;int mid;
        while(l<=h){
            mid = (l+h)/2;
            if(nums[mid]==target){
                int lb = lower_bound(nums.begin(),nums.end(),target)-nums.begin();
                int ub = upper_bound(nums.begin(),nums.end(),target)-nums.begin();
                return {lb, ub - 1};
            }else if(target>nums[mid]){
                l = mid+1;
            }else{
                h= mid-1;
            }
        }
        return {-1,-1};
}
};