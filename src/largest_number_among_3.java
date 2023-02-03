import java.util.Scanner;

public class largest_number_among_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers--->");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Largest Number-->"+a);
        } else if (b>c) {
            System.out.println("Largest Number-->"+b);
        }
        else{
            System.out.println("Largest Number-->"+c);
        }
    }
}
