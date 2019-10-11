public class Solution {
    public Node copyRandomList(Node head) {
        Node newHead = null;
        Node newLast = null;
        Node cur = head;
        while(cur != null){
            Node node = new Node();
            node.val = cur.val;
            if(newHead == null){
                newHead = node;
            }else{
                newLast.next = node;
            }
            newLast = node;
            map.put(cur,node);
        }
    }
}
