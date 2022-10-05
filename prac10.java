import java.util.Scanner;

public class prac10 {
    char[] data;
    static final int default_size = 10;
    int ptr = -1;
    prac10(int size){
        this.data = new char[size];
    }
    prac10(){
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
    int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }

    String infixToPostfix(String s, prac10 stack)
    {
        String result = new String("");
 
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
 
     
            if (Character.isLetterOrDigit(c))
                result += c;
 
         
            else if (c == '(')
                stack.push(c);
 
    
            else if (c == ')') {
                while (!stack.isempty()
                       && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
 
                stack.pop();
            }
            else 
            {
                while (!stack.isempty()
                       && Prec(c) <= Prec(stack.peek())) {
 
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isempty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
       
        return result;
    }

    
	public static void main(String[] args)
	{
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = inp.next();
        int n = str.length();
        prac10 arr = new prac10(n);
        String ans = arr.infixToPostfix(str,arr);
        System.out.println(ans);
		
	}
}