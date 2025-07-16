public class Range {
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

    public static void range(Node root,int k1,int k2){
        
        if(root==null){
            return;
        }

        //case 1
       if(root.data>=k1 && root.data<=k2){
            range(root.left,k1,k2);
            System.out.println(root.data);
            range(root.right,k1,k2);
       }else if(root.data<=k1){
             range(root.left,k1,k2);  
       }
       else{
            range(root.right,k1,k2);
       }
        // return root;
    }

   

    public static void main(String[] args){
        int values[]={5,1,6,8,10,11,14,4,3};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        range(root,5,12);
    }
}