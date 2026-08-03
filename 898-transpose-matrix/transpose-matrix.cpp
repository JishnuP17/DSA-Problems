class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        int rows = matrix.size();
        int cols = matrix[0].size();

        // Initialize transpose matrix with correct dimensions
        vector<vector<int>> t(cols, vector<int>(rows));

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                t[j][i] = matrix[i][j];   
            }
        }
        return t;
    }
};
