package inflearn.N7;

import java.util.LinkedList;
import java.util.Queue;

public class N7_10_짧은경로_BFS {

	private static class Node {
		int data;
		Node lt, rt;

		public Node(int val) {
			this.data = val;
		}
	}

	private Node root;

	public int BFS(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		int level = 0;
		while(!queue.isEmpty()) {
			int length = queue.size();
			for(int i=0; i<length; i++) {
				Node current = queue.poll();
				if(current.lt==null && current.rt==null) return level;
				if(current.lt!=null) queue.offer(current.lt);
				if(current.rt!=null) queue.offer(current.rt);
			}
			level++;
		}
		return 0;
	}

	public static void main(String[] args) {
		N7_10_짧은경로_BFS tree = new N7_10_짧은경로_BFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));
	}
}
