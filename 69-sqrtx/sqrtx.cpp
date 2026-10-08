class Solution {
public:
    int mySqrt(int x) {
        int root;
        int l = 0;
        int h = x;int mid;
        while(l<=h){
            mid = (l+h)/2;
            if((long long)mid*mid<=x){
                root = mid;
                l= mid+1;
            }else{
                h = mid-1;
            }
        }
        return root;
    }
};