class Solution {
    public int firstUniqChar(String s) {

        LinkedHashMap<Character, Integer> d = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (d.containsKey(ch))
                d.put(ch, d.get(ch) + 1);
            else
                d.put(ch, 1);
        }

        int i = 0;

        for (char ch : d.keySet()) {
            if (d.get(ch) == 1)
                return s.indexOf(ch);
        }

        return -1;
    }
}