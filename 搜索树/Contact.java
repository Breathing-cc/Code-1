public class Contact {
    public static class Node{
        String name;
        String phone;

        Node left;
        Node right;
    }
    private Node root = null;
    public boolean insert(String name, String phone){}
    public String uptate(String name, String phone){
        Node cur = root;
        while(cur != null){
            int r = name.compareTo(cur.name);
            if(r == 0){
                String oldPhone = cur.phone;
                cur.phone = phone;
                return oldPhone;
            }else if(r < 0){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }
        return null;
    }
    public String search(String name, String phone){
        Node cur = root;
        while(cur != null){
            int r = name.compareTo(cur.name);
            if(r == 0){
                return phone;
            }else if(r < 0){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }
        return null;
    }
}
