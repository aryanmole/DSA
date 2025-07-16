
public class P3{
	
	static class Node{
		int data;
		Node left,right;

		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}	

	public static Node del(Node root,int k){

		if(root==null){
			return null;
		}

		root.left=del(root.left,k);
        root.right=del(root.right,k);

        if(root.left==null && root.right==null){
            if(root.data==k){
                return null;
            }
        }
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
		Node root=new Node(1);
		root.left=new Node(3);
		root.right=new Node(3);
		root.left.left=new Node(3);
		root.left.right=new Node(2);
		
		int k=3;
        root=del(root,k);
		preorder(root);

	}
	
}