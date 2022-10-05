import java.util.Scanner;

public class prac8 {
    char[] data;
    static final int default_size = 10;
    int ptr = -1;
    prac8(int size){
        this.data = new char[size];
    }
    prac8(){
        this(default_size);
    }
    boolean isfull(){
        return ptr == data.length;
    }
    boolean isempty(){
        return ptr == -1;
    }
    char pop(){
        if(isempty()){
            System.out.println("stack is empty");
        }else{
            char removed = data[ptr];
            ptr = ptr-1;
            return removed;
        }
        return '0';

    }
    char peek(){
        if(isempty()){
            System.out.println("cannot peek");
            return '0';
        }
        return data[ptr]; 
    }
    boolean push(char item){
        if(isfull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = inp.nextLine();
        int n = s.length();
        prac8 arr = new prac8(n);
        int i;
        for (i = 0; i < n; i++){
            arr.push(s.charAt(i));
        }
        System.out.println("The Reverse is : ");
        for (i = 0; i < n; i++) {
            char ch = arr.pop();
            System.out.print(ch);;
        }
    }

}
