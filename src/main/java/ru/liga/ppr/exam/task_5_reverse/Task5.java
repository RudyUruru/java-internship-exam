package ru.liga.ppr.exam.task_5_reverse;

public class Task5 {

    public static Node<String> reverse(
            Node<String> head) {
        Node<String> buff;
        while (head.next != null) {
            buff = head.next;
            head.next = head.prev;
            head.prev = buff;
            head = buff;
        }
        head.next = head.prev;
        head.prev = null;
        return head;
    }

}
