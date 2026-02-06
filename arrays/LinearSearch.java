
import java.util.Scanner;

class LinearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter te element to search: ");
        int key=sc.nextInt();
        int pos=-1;
        for(int i=0;i<s;i++){
            if(arr[i]==key){
                pos=i;
                break;
            }
        }
        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+pos);
        }
        sc.close();
    }
}