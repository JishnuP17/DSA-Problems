class Solution {
public:
    int alternateDigitSum(int n) {
            int sum = 0;
    int eo = 0;
    int cnt;
    int temp = n;
   int x = (int)log10(n) + 1;

    if(x%2==0){
      cnt =1;
    }else{
      cnt = 0;
      }
    
    
    // loop until all digits are processed
    while (cnt <= n) {
        int rem = temp % 10;
        if (cnt % 2 == 0) {
            sum += rem;
            eo++;
        } else {
            sum -= rem;
            eo++;
        }
        temp = temp / 10;
        cnt++;
        if (temp == 0) break; // stop when digits are finished
    }
        return sum;
    }
};