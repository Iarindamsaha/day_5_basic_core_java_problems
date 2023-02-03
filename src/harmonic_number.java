import java.util.Scanner;

public class harmonic_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Nth Number");
        int input = sc.nextInt();
        double result = 0.0;
        while(input>0){
            result = result + (double)1/input;
            input--;
            System.out.print(result + ",");
        }
    }
}
