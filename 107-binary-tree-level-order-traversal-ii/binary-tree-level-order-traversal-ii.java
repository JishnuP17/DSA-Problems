class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return l;
        }

        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode a = q.poll();

                temp.add(a.val);

                if (a.left != null) {
                    q.offer(a.left);
                }

                if (a.right != null) {
                    q.offer(a.right);
                }
            }

            l.add(temp);
        }

        Collections.reverse(l);
        return l;
    }
}