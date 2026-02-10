package inflearn.N7;

class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}
public class N07_05_이진트리순_DFS {
	Node root;
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
		N07_05_이진트리순_DFS tree = new N07_05_이진트리순_DFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.lt = new Node(7);
		tree.DFS(tree.root);
	}
}
