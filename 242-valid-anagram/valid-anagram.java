class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> d1 = new HashMap<>();
        HashMap<Character, Integer> d2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (d1.containsKey(ch))
                d1.put(ch, d1.get(ch) + 1);
            else
                d1.put(ch, 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (d2.containsKey(ch))
                d2.put(ch, d2.get(ch) + 1);
            else
                d2.put(ch, 1);
        }

        return d1.equals(d2);
    }
}