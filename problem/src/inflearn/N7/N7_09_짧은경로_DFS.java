package inflearn.N7;

public class N7_09_짧은경로_DFS {

	private static class Node {
		int data;
		Node lt, rt;

		public Node(int val) {
			this.data = val;
		}
	}

	private Node root;

	public int DFS(int level, Node root) {
		if(root.lt==null && root.rt==null) return level;
		else return Math.min(DFS(level+1, root.lt), DFS(level+1, root.rt));
	}

	public static void main(String[] args) {
		N7_09_짧은경로_DFS tree = new N7_09_짧은경로_DFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.DFS(0, tree.root));
	}
}
