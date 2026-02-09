
import java.util.Scanner;

class BubbleSort{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the range of the array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sort the array? (y/n): ");
        char ch=sc.next().charAt(0);
        if(ch=='y'|| ch=='Y'){
            bubbleSort(arr);
            System.out.println("Sorted Array!");
            printArray(arr);
        }else{
            System.out.println("Unsorted Array!!");
        }
        sc.close();
    }
    public static void bubbleSort(int[] arr){
        if(arr==null || arr.length==0) return;
        int n=arr.length;
        boolean Swap;
        for(int i=0;i<n-1;i++){
            Swap=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    Swap=true;
                }
            }
            if(!Swap) break;
        }
    }
    public static void printArray(int[] arr){
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
}