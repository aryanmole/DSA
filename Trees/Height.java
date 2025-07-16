public class Height{
	static class Node{
		int data;
		Node left,right;

		public Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}	

	public static int height(Node root){
		if(root==null){
			return 0;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		return Math.max(lh,rh)+1;
	}

	public static int count(Node root){
		if(root==null){
			return 0;
		}
		int lh=count(root.left);
		int rh=count(root.right);
		return lh+rh+1;
	}

	public static int sum(Node root){
		if(root==null){
			return 0;
		}
		int lh=sum(root.left);
		int rh=sum(root.right);
		return lh+rh+root.data;
	}

	public static int diameter1(Node root){
			if(root==null){
			  	return 0;
		}

		int leftdiam=diameter1(root.left);
		int rightdiam=diameter1(root.right);
		int leftheight=height(root.left);
		int rightheight=height(root.right);

		return Math.max(leftheight+rightheight+1,Math.max(leftdiam,rightdiam));
	}


	static class Info{
		int diam;
		int ht;

		Info(int diam, int ht){
			this.diam=diam;
			this.ht=ht;
		}
	}

	public static Info diameter(Node root){
		if(root==null){
			return new Info(0,0);
		}
		Info leftInfo=diameter(root.left);
		Info rightInfo=diameter(root.right);
 		
		int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
		int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
		
		return new Info(diam,ht);
	}

	public static void main(String[] args){
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.right.left=new Node(5);
		root.right.right=new Node(6);

		System.out.println(diameter(root).diam);
	}
}