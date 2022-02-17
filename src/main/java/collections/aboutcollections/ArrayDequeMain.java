package collections.aboutcollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeMain {
    public static void main(String[] args) {
        Deque <Integer> stack = new ArrayDeque<>();
        stack.push(1); //push, pop as stack, добавляется и удаляется из начала (0 индекса)
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        Deque <Integer> queue = new ArrayDeque<>();
        queue.offer(11); //offer, poll as queue, добавляется в конец, а удаляется из начала (0 индекс)
        queue.offer(22);
        queue.offer(33);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
