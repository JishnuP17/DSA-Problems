class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1 = new Stack<>();
        int a = s.length();
        for(int i=0;i<a;i++){
            if(!s1.isEmpty()){
                if(s1.peek()==s.charAt(i)){
                    s1.pop();
                }else{
                    s1.push(s.charAt(i));
                }
            }else{
                s1.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char x:s1){
            sb.append(x);
        }
        return sb.toString();


    }
}