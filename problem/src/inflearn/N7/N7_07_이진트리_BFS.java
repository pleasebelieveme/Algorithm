package inflearn.N7;

import java.util.LinkedList;
import java.util.Queue;

public class N7_07_이진트리_BFS {

	private static class Node {
		int data;
		Node lt, rt;

		public Node(int val) {
			this.data = val;
		}
	}

	private Node root;
	public void BFS(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		int level = 0;
		while (!queue.isEmpty()) {
			int length = queue.size();
			System.out.print(level + " : ");
			for(int i=0; i<length; i++) {
				Node current = queue.poll();
				System.out.println(current.data + " ");
				if(current.lt != null) queue.offer(current.lt);
				if(current.rt != null) queue.offer(current.rt);
			}
			level++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		N7_07_이진트리_BFS tree = new N7_07_이진트리_BFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);
	}
}
