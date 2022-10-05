class L_list{
    Node head;
    Node tail;
    int size;
    L_list(){
        this.size = 0;
    }
    public void insert_first(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
        if(tail==null){
            tail = head;
        }
    } 
    public void insert_last(int val){
        if(tail==null){
            insert_first(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next; 
        }
        System.out.println("end");
    }
    public void insert(int val,int index){
        if(index == 0){
            insert_first(val);
            return;
        }
        if(index == size){
            insert_last(val);
            return;
        }
        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }
    int delete_first(){
        int value = head.val;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return value;
    }
    int delete_last(){
        if(size<=1){
            return delete_first();
        }
        Node second_last = get_node(size-2);
        int val = tail.val;
        tail = second_last;
        tail.next = null;
        return val;

    }
    int delete(int index){
        if(index == 0){
            return delete_first();
        }
        if(index == size -1){
            return delete_last();
        }
        Node prev = get_node(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
 
    }


    Node get_node(int index){
        Node node = head;
        for(int i = 0; i<index;i++){
            node = node.next;
        }
        return node;
    }
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }    
}

public class prac4 {
    public static void main(String[] args) {
        L_list arr = new L_list();
        arr.insert_first(1);
        arr.insert(2,1);
        arr.insert(3,2);
        arr.insert(4,3);
        arr.insert(5,4);
        arr.insert(6,5);
        arr.display();
        arr.delete_first();
        arr.display();
        arr.delete_last();
        arr.display();
        arr.delete(2);
        arr.display();

         
        
    }
   
    
    
    
    
}
