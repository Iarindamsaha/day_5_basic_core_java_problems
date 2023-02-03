import java.util.Scanner;

public class quotient_and_remainder {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Divisor");
        int a = sc.nextInt();
        System.out.println("Enter Dividend");
        int b = sc.nextInt();
        System.out.println("Quotient="+a/b);
        System.out.println("Remainder="+a%b);
    }
}
