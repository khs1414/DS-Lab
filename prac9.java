import java.util.Scanner;

public class prac9 {
    char[] data;
    static final int default_size = 10;
    int ptr = -1;
    prac9(int size){
        this.data = new char[size];
    }
    prac9(){
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

    boolean areBracketsBalanced(String s, prac9 arr){
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
 
            if (x == '(' || x == '[' || x == '{') {

                arr.push(x);
                continue;
            }
 
            if (arr.isempty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = arr.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = arr.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = arr.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        return (arr.isempty());
    }

    
	public static void main(String[] args)
	{
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = inp.nextLine();
        int n = str.length();
        prac9 arr = new prac9(n);
        boolean x = arr.areBracketsBalanced(str,arr);
		if (x){
			System.out.println("Balanced ");
        }
		else{
			System.out.println("Not Balanced ");
        }
	}
}