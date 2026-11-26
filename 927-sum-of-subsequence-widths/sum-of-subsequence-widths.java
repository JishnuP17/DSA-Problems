
import java.util.*;

class Solution {
    public int sumSubseqWidths(int[] nums) {
        int mod = 1000000007;
        Arrays.sort(nums);

        int n = nums.length;
        long[] power = new long[n];

        power[0] = 1;

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }

        long result = 0;

        for (int i = 0; i < n; i++) {
            long maxWays = power[i];
            long minWays = power[n - 1 - i];

            result = (result + nums[i] * (maxWays - minWays)) % mod;
        }

        return (int) ((result + mod) % mod);
    }
}
