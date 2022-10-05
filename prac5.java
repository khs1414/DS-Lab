class DL_list{
    Node head;
    void insert_first(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    void insert_last(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head==null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;   
    }

    Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;

    }

    void insert(int after, int val){
        Node p  = find(after);
        if(p==null){
            System.out.println("element doesn't exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev  = node;
        }

    }

    void deletehead() {
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp = null;
    }


    void deleteend() {
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        Node temp = last;
        last = last.prev;
        last.next = null;
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




    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        Node(int val){
            this.val = val;
        }
    }
}

public class prac5 {
    public static void main(String[] args) {
        DL_list list = new DL_list();
        list.insert_first(1);
        list.insert_last(2);
        list.insert_last(3);
        list.insert(2, 5);
        list.display();
        list.deletehead();
        list.display();
        list.deleteend();;
        list.display();
    }
}
