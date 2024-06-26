public class Node {
    public int value;
    public Node next;

    Node(int value, Node refnode) {
        this.value = value;
        this.next = refnode;
    }
}
