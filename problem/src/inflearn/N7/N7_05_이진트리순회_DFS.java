package inflearn.N7;

public class N7_05_이진트리순회_DFS {

	private static class Node {
		int data;
		Node lt, rt;

		public Node(int val) {
			this.data = val;
		}
	}

	private Node root;
	public void DFS(Node root) {
		if(root==null) return;
		else {
			// 전위순회(루트노드 먼저)
			System.out.println(root.data + " ");
			DFS(root.lt);
			// 중위순회(루트노드 중간)
			DFS(root.rt);
			// 후위순회(루트노드 나중에)
		}
	}
	public static void main(String[] args) {
		N7_05_이진트리순회_DFS tree = new N7_05_이진트리순회_DFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
}
