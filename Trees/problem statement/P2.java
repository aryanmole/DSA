
public class P2{
	
	static class Node{
		int data;
		Node left,right;

		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}	

	public static Node inverted(Node root){

		if(root==null){
			return null;
		}

		Node temp=root.left;
        root.left=root.right;
        root.right=temp;

       inverted(root.left);
        inverted(root.right);
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
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
        root.right.right=new Node(7);
		
        root=inverted(root);
		preorder(root);

	}
	
}