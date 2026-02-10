
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        if(arr==null||arr.length<=1){
            return;
        }
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the range of the arraay: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sort the array? (y/n): ");
        char ch=sc.next().charAt(0);
        if(ch=='n'||ch=='N'){
            System.out.println("Original Array: ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }else{
            System.out.println("Sorted Array: ");
            insertionSort(arr);
        }
    }
    
}
