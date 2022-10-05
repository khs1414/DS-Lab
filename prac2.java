import java.util.*;
class prac2{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int len = 10;
        Random r = new Random();
        int arr[] = new int[len];
        System.out.println("Array made : ");
        for(int j = 0; j<10;j++){
            arr[j] = r.nextInt(10);
        }
        for(int j = 0; j<len;j++){
            System.out.print(arr[j] + " ");;
        }
        System.out.println();
        System.out.println("Element at Even index ");
        for(int i = 0; i<len;i++){
            if(i%2==0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Element at Odd index ");
        for(int m = 0; m<len;m++){
            if(m%2!=0){
                System.out.print(arr[m] + " ");
            }
        }
        System.out.println();
        System.out.println("The last element : "+arr[len-1]);
        System.out.println("The first element : "+arr[0]);
        
        System.out.println("List in reverse : ");
        for(int i=len-1;i>=0;i--){
         System.out.print(arr[i] + " ");
    }

    }
}