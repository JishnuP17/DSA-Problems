class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i:nums1){
            h.add(i);
        }
        for(int i:nums2){
            if(h.contains(i)){
                a.add(i);
                h.remove(i);
            }
        }
        int[] arr = new int[a.size()];

        for(int i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }
        return arr;
        
    }
}