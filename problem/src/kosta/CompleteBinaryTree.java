package kosta;

import java.util.ArrayDeque;
import java.util.Queue;

// 완전이진트리
public class CompleteBinaryTree<T> {

    private Object[] nodes;
    private int lastIndex;
    private final int SIZE;

    public  CompleteBinaryTree(int size) {
        SIZE = size;
        lastIndex = 0;
        nodes = new Object[size+1];
    }
    public boolean isEmpty() {
        return lastIndex==0;
    }
    public boolean isFull() {
        return lastIndex == SIZE;
    }
    public void add(T e) {
        if(isFull()) throw new RuntimeException("트리가 포화상태입니다.");
        nodes[++lastIndex] = e;
    }
    public void bfs(){
        if(isEmpty()) return;
        Queue<Integer> queue = new ArrayDeque<>(); // 큐를 통해 노드의 탐색순서 관리, 노드를 탐색하는데 필요한 정보 저장
        queue.offer(1);// 루트노드부터
        while (!queue.isEmpty()) { // 큐에 탐색대상정보가 있으면 계속 반복
            int cur = queue.poll(); // 탐색해야 할 노드의 정보(인덱스)

            //노드탐색 관련된 작업
            System.out.print(nodes[cur] + "  ");

            // 해당 노드의 자식노드들도 탐색될 수 있도록 관리
            // 이진트리이므로 왼쪽자식과 오른쪽자식만 관리
            //if (nodes[cur*2] != null) --> if문이 하나 더 필요
            if(cur*2 <= lastIndex) queue.offer(cur*2);
            if(cur*2+1 <= lastIndex) queue.offer(cur*2+1);
        }
    }

    //전위탐색
    public void dfsByPreOrder(int cur){

            //노드탐색 관련된 작업
            System.out.print(nodes[cur] + "  ");
            // 해당 노드의 자식노드들도 탐색될 수 있도록 관리
            // 이진트리이므로 왼쪽자식과 오른쪽자식만 관리
            //if (nodes[cur*2] != null) --> if문이 하나 더 필요
            if(cur*2 <= lastIndex) dfsByPreOrder(cur*2);
            if(cur*2+1 <= lastIndex) dfsByPreOrder(cur*2+1);
    }

    //중위순회
    public void dfsByInOrder(int cur){
            // 해당 노드의 자식노드들도 탐색될 수 있도록 관리
            // 이진트리이므로 왼쪽자식과 오른쪽자식만 관리
            if(cur*2 <= lastIndex) dfsByInOrder(cur*2);
            //노드탐색 관련된 작업
            System.out.print(nodes[cur] + "  ");
            if(cur*2+1 <= lastIndex) dfsByInOrder(cur*2+1);
    }
    //후위순회
    public void dfsByPostOrder(int cur){
            // 해당 노드의 자식노드들도 탐색될 수 있도록 관리
            // 이진트리이므로 왼쪽자식과 오른쪽자식만 관리
            if(cur*2 <= lastIndex) dfsByPostOrder(cur*2);
            //노드탐색 관련된 작업
            if(cur*2+1 <= lastIndex) dfsByPostOrder(cur*2+1);
            System.out.print(nodes[cur] + "  ");
    }
}
