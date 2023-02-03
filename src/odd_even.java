import java.util.Scanner;

public class odd_even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check odd or even");
        int  input = sc.nextInt();
        if(input % 2 == 0){
            System.out.println(input+"--->is Even");
        }
        else{
            System.out.println(input+"--->is Odd");
        }
    }
}
