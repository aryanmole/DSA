public class Mirror {
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

  

   public static Node mirror(Node root){
    if(root==null){
        return null;
    }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    
        mirror(root.left);
        mirror(root.right);
        return root;
   }

   public static void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}

    public static void main(String[] args){
        int values[]={8,5,3,6,10,11};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        root=mirror(root);
		preorder(root);
    }
}
