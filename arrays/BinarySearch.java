
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the range of the elements: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int ele=sc.nextInt();
        int beg=0,end=n-1,pos=-1;
        while(beg<=end){
            int mid=(beg+end)/2;
            if(ele==arr[mid]){
                pos=mid;
                break;
            }
            else{
                if(ele<arr[mid]){
                    end=mid-1;
                }
                else{
                    beg=mid+1;
                }
            }
        }
        if(pos>=0){
            System.out.println("Element found at index: "+pos);
        }
        else{
            System.out.println("Element not found!");
        }
    }
}
