public class prac7_2 {
    Node top;
    class Node{
        int data;
        Node next;
        Node(){
            this.data = 0;
            this.next = null;
        }
    }

    void push(int item){
        Node newnode = new Node();
        if(top==null){
            top = newnode;
            newnode.data = item;
        }else{
            newnode.data = item;
            newnode.next = top;
            top = newnode;
        }
    }

    void display(){
        Node temp = top;
        if(temp==null){
            System.out.println("Stack is Empty");
        }
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    void peek(){
        System.out.println(top.data);
        System.out.println("");
    }
    void pop(){
        Node temp = top;
        top = top.next;
        if(top==null){
            System.out.println("Stack is empty not possible");
        }
        temp = null;
    }
    void isempty(){
        Node temp = top;
        if(temp==null){
            System.out.println("It is empty");
        }else{
            System.out.println("It is not empty");
        }
    }

    public static void main(String[] args) {
        prac7_2 Stackimp = new prac7_2();
        for(int i=4; i>0; i--){
            Stackimp.push(i);
        }
        Stackimp.display();
        Stackimp.peek();
        Stackimp.pop();
        Stackimp.display();
        Stackimp.pop();
        Stackimp.peek();
        Stackimp.display();
        Stackimp.isempty();

    }
}
