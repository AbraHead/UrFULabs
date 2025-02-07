public class DSD_create {
    public static void main(String[] args) {
        // создание 1-го узла, который изначально является головой, и хвостом списка
        Node head = new Node(0, null);
        Node tail = head;
        // добавление элементов с наращиванеим хвоста
        for (int i = 0; i<9; i++) {
            tail.next = new Node(i+1, null);
            tail = tail.next; // указатель на созданный элемент запоминается
        }                     // как указатель на новый хвост
        // вывод элементов на экран
        Node ref = head;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
