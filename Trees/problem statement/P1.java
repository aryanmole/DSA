
public class P1{
	
	static class Node{
		int data;
		Node left,right;

		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}	

	public static boolean present(Node root,int k){

		if(root==null){
			return false;
		}

		if(root.data==k){
			return true;
		}
			boolean lp=present(root.left,k);
			boolean rp=present(root.right,k);

            if(lp || rp){
                return true;
            }

			return false;
	}
	

	
	public static void main(String[] args){
		Node root=new Node(2);
		root.left=new Node(2);
		root.right=new Node(2);
		root.left.left=new Node(5);
		root.left.right=new Node(2);
		
		int k=2;
		System.out.println(present(root,k));
	}
	
}