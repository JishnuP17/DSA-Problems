class Solution {
    public int minAddToMakeValid(String s) {
        int cnt = 0;
        Stack<Integer> st = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                if(s.charAt(i)==')'){
                    if(!st.isEmpty()){
                        st.pop();
                    }else{
                        cnt++;
                    }
                }
            }
        }
        while(!st.isEmpty()){
            st.pop();
            cnt++;
        }
        return cnt;

        
    }
}