class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<Integer>();
        int sum = 0;int rem=0;
        while(n!=1 && !s.contains(n)){
            s.add(n);
            sum=0;
            while(n!=0){
                rem = n%10;
                sum = sum + (rem*rem);
                n = n/10;
            }
            n = sum;
        }
        if (n==1)
        return true;
        else
        return false;
    }
}