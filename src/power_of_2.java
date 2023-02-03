import java.util.Scanner;

public class power_of_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter a number between 0 - 31");
        int input = sc.nextInt();
        while (i <= input) {
            if (input >= 0 && input <= 31) {
                int power = (int) Math.pow(2, i);
                System.out.println(power);
            } else {
                System.out.println("Value Out of Range");
                break;
            }
            i++;
        }
    }
}
