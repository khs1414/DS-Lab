import java.util.*;
class prac3{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len;
        len = inp.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter elements : ");
        for(int j = 0; j<len;j++){
            System.out.print("Enter the " + j+" index : ");
            arr[j] = inp.nextInt();
        }

        System.out.println("Sum of all elemets ");
        int sum_all = 0;
        int sum_alt = 0;
        for(int i = 0; i<len;i++){
            sum_all  = sum_all + arr[i]; 
            if(i%2==0){
                sum_alt = sum_alt + arr[i];
            }
        }
        System.out.println("Sum of all elements : " + sum_all);
        System.out.println("Sum of alternate elements : " + sum_alt);
        int n = len;  
        int t = 0;  
         for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    t = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = t;  
                    }      
                 }  
         }
        System.out.println("The second highest is : " +  arr[len-2]); 
    }
}