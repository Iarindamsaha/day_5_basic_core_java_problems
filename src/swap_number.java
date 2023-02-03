import java.util.Scanner;

public class swap_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number");
        int b =sc.nextInt();

        System.out.println("Before Swapping:-->\n"+"A = "+a+"\n"+"B = "+b);

        int c = b;
        b= a;
        a=c;

        System.out.println("After Swapping:-->\n"+"A = "+a+"\n"+"B = "+b);


    }
}
