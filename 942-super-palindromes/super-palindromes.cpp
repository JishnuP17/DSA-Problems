
class Solution {
public:
    bool isPalindrome(long long n) {
        string s = to_string(n);
        string rev = s;
        reverse(rev.begin(), rev.end());
        return s == rev;
    }

    int superpalindromesInRange(string left, string right) {
        long long l = stoll(left);
        long long r = stoll(right);

        long long limit = sqrtl(r);
        int count = 0;

        for (long long i = 1; i < 100000; i++) {
            string s = to_string(i);

            // Odd-length palindrome
            string odd = s;
            for (int j = s.size() - 2; j >= 0; j--) {
                odd += s[j];
            }

            long long num = stoll(odd);

            if (num <= limit) {
                long long square = num * num;

                if (square >= l && isPalindrome(square)) {
                    count++;
                }
            }

            // Even-length palindrome
            string even = s;
            for (int j = s.size() - 1; j >= 0; j--) {
                even += s[j];
            }

            num = stoll(even);

            if (num <= limit) {
                long long square = num * num;

                if (square >= l && isPalindrome(square)) {
                    count++;
                }
            }

            if (stoll(odd) > limit && stoll(even) > limit)
                break;
        }

        return count;
    }
};
