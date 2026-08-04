class Solution {
public:
    vector<int> luckyNumbers(vector<vector<int>>& arr) {
        vector<int> v;
        int rows = arr.size();
        int cols = arr[0].size();
        for(int i=0;i<rows;i++){
            int min = INT_MAX;
            int ind;
            int max;
            for(int j=0;j<cols;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    ind = j;
                    max = arr[i][j];
                }
            }
            for(int j=0;j<rows;j++){
                if(arr[j][ind]>max){
                    max = arr[j][ind];
                    break;
                }
            }
            if(max==min){
                return {min};
            }
        }
        return {};
    }
};