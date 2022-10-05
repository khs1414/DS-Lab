public class prac6 {
    int size = -1;
    Node head;
    Node tail;

    class Node {
        Node prev;
        Node next;
        int data;

        Node() {
            this.data = 0;
            this.prev = null;
            this.next = null;
        }
    }


    void insertbeg(int item) {
        Node newnode = new Node();
        if (head == null) {
            tail = newnode;
            head = newnode;
            newnode.data = item;
            size++;
        } else {
            head.prev = newnode;
            newnode.next = head;
            newnode.data = item;
            head = newnode;
            head.prev = tail;
            tail.next = head;
        }
    }


    void printreverse() {
        Node temp = tail;
        while (temp!=null) {
            System.out.print(" " + temp.data + "->");
            temp = temp.prev;
            if(temp==tail){
                break;
            }else{
                continue;
            }
        }
        System.out.println(" ");
    }


    void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data + " ->");
            temp = temp.next;
            if(temp==head){
                break;
            }else{
                continue;
            }
        }
        System.out.println(" ");
    }
   

    void insertafter(int pos, int item) {
        Node newnode = new Node();
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node a = temp.next;
        temp.next = newnode;
        newnode.prev = temp;
        newnode.data = item;
        newnode.next = a;
        a.prev = newnode;
    }


    void insertbefore(int pos, int item) {
        Node newnode = new Node();
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        Node a = temp.next;
        temp.next = newnode;
        newnode.prev = temp;
        newnode.data = item;
        newnode.next = a;
        a.prev = newnode;
    }


    void insertend(int item) {
        Node newnode = new Node();
        newnode.data=item;
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
        tail.next = head;
        head.prev = tail;
    }


    void deletehead() {
        Node temp = head;
        head = head.next;
        head.prev = tail;
        tail.next = head;
        temp = null;
    }


    void deleteend() {
        Node temp = tail;
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
        temp = null;
    }


    void deleteafter(int pos) {
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        Node a = temp.next.next;
        a.prev = temp;
    }

    void deletebefore(int pos) {
        Node temp = head;
        for (int i = 1; i < pos - 2; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        Node a = temp.next.next;
        a.prev = temp;
    }
    

    public static void main(String[] args) {
        prac6 node = new prac6();
        node.insertbeg(1);
        node.insertbeg(2);
        node.insertbeg(3);
        node.insertbeg(4);
        node.insertend(0);
        node.printlist();
        node.deletehead();
        node.printlist();
        node.deleteend();
        node.printlist();
        node.printreverse();
        node.printlist();

    }
}
