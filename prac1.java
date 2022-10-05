import java.util.*;
class prac1{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int len;
        len = inp.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter array data : ");
        for(int j = 0; j<len;j++){
            System.out.print("Enter the " + j+" index : ");
            arr[j] = inp.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<len;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        int diff = max - min;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("The difference b/w max and min is : "+ diff);

    }
}