package alco;

import java.util.LinkedList;
import java.util.Queue;

// First In First Out(FIFO)
// Last In Last Out(LILO)
public class L6_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.add(6)); // 실패시 Exception
        System.out.println(queue.offer(7)); // 실패시 false
        System.out.println(queue.remove()); // 1 삭제
        System.out.println(queue.remove(1)); // false
    }
}
