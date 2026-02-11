
import java.util.Scanner;

public class ContainString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String str=sc.nextLine();
        System.out.println("Enter the word to search: ");
        String str1=sc.nextLine();
        boolean res;
        res=str.contains(str1);
        if(res){
            System.out.println("String contains '"+str1+"'");
        }
    }
}