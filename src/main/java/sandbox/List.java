package sandbox;

public class List {

    private Node head;
    private int size = 0;

    public List() {
        head = null;
    }

    public void insertTail(int i) {
        int count = 0;
        Node lastNode = head;
        while (count++ < size) {
            lastNode = lastNode.next;
        }
        lastNode.next = new Node(i, null);
        size++;
    }

    public int get(int i) {
        Node lastNode = head;
        while (i-- > 0) {
            lastNode = lastNode.next;
        }
        return lastNode.val;
    }

    private static class Node {

        private int val;
        private Node next;

        private Node(int v, Node n) {
            val = v;
            next = n;
        }
    }
}
