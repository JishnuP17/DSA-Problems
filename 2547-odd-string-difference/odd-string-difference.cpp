
class Solution {
public:
    string oddString(vector<string>& words) {
        vector<vector<int>> diff;

        for (string word : words) {
            vector<int> temp;

            for (int i = 1; i < word.size(); i++) {
                temp.push_back(word[i] - word[i - 1]);
            }

            diff.push_back(temp);
        }

        if (diff[0] == diff[1]) {
            for (int i = 2; i < words.size(); i++) {
                if (diff[i] != diff[0]) {
                    return words[i];
                }
            }
        } else {
            if (diff[0] == diff[2]) {
                return words[1];
            }
            return words[0];
        }

        return "";
    }
};
