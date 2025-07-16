public class Search {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root,int val){
        
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
           root.left= insert(root.left,val);
        }else{
           root.right= insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);    
    }

    public static boolean search(Node root,int k){

        if(root==null){
            return false;
        }

        if(root.data==k){
            return true;
        }

        if(root.data>k){
           return search(root.left,k);
        }else{
           return search(root.right,k);
        }

    }

    public static void main(String[] args){
        int values[]={5,1,2,4,3};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        int k=7;
        System.out.println(search(root,k));
    }
}
