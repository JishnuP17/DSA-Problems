class Solution {
public:
    int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;

        // Total money for complete weeks
        int total = weeks * 28 + (weeks * (weeks - 1) / 2) * 7;

        // Money for remaining days
        for (int i = 0; i < days; i++) {
            total += weeks + i + 1;
        }

        return total;
    }
};