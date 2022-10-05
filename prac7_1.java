public class prac7_1 {
    int[] data;
    static final int default_size = 10;
    int ptr = -1;
    prac7_1(int size){
        this.data = new int[size];
    }
    prac7_1(){
        this(default_size);
    }
    boolean isfull(){
        return ptr == data.length;
    }
    boolean isempty(){
        return ptr == -1;
    }
    int pop(){
        if(isempty()){
            System.out.println("stack is empty");
        }else{
            int removed = data[ptr];
            ptr = ptr-1;
            return removed;
        }
        return -1;

    }
    int peek(){
        if(isempty()){
            System.out.println("cannot peek");
            return -1;
        }
        return data[ptr]; 
    }
    boolean push(int item){
        if(isfull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public static void main(String[] args) {
        prac7_1 arr = new prac7_1(10);
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        System.out.println(arr.pop());
        System.out.println(arr.peek());
        System.out.println(arr.pop());
        System.out.println(arr.peek());

    }

}
