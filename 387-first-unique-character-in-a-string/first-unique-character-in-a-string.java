class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> d = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (d.containsKey(ch))
                d.put(ch, d.get(ch) + 1);
            else
                d.put(ch, 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (d.get(ch) == 1)
                return i;
        }

        return -1;
    }
}