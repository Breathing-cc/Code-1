public class BinarySearchTree {
    public static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }

        public Node search(int key) {
            Node cur = root;
            while (cur != null) {
                if (key == cur.key) {
                    return key;
                } else if (key < cur.key) {
                    cur = cur.left;
                } else {
                    cur = cur.right;
                }
            }
            return null;
        }

        public boolean insert(int key) {
            if (root == null) {
                root = new Node(key);
                return true;
            }
            Node cur = root;
            Node parent = null;
            while (cur != null) {
                if (key == cur.key) {
                    return false;
                } else if () {
                }else{}
            }

        }

        public static void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();
            int[] keys = {3,};
            for (int key : keys) {
                System.out.println(tree.insert(7));
            }
            System.out.println("插入重复数据");
            System.out.println(tree.insert(7));

        }

        private
    }
  }
