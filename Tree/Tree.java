import util.java.Stack;
public class Tree {
    public static Node buildTree(){
        Node n1
    }
    public static void perorder(Node root){
        Stack<Node> stack =new Stack<>();
        Node cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur!=null){
                System.out.println(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
    }
    public static void inrorder(Node root){
        Stack<Node> stack =new Stack<>();
        Node cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.println(top.val);
            cur = top.right;
        }
    }
    public static void postorder(Node root){
        Stack<Node> stack =new Stack<>();
        Node cur = root;
        Node last=null;
        while(cur != null || !stack.isEmpty()){
            while(cur!=null){
                System.out.println(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.peek();
            if(top.right == null || top.right == last){
                System.out.println(top.val);
                stack.pop();
                last = top;
            } else{
                cur=top.right;
            }
        }
    }
    public static void main(String[] args) {
        Node root = buildTree();
        perorder(root);

    }
}
