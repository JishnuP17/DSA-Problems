class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                s1.push(i);
                sb.append(s.charAt(i));
            }else{
                if(s.charAt(i)==')'){
                    if(!s1.isEmpty()){
                        s1.pop();
                        sb.append(s.charAt(i));
                    }else{
                        sb.append('*');
                    }
                }else{
                    sb.append(s.charAt(i));
                }
            }
        }
        while(!s1.isEmpty()){
            sb.setCharAt(s1.pop(),'*');
        }
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='*'){
                sb1.append(sb.charAt(i));
            }
        }
        return sb1.toString();
    }
}