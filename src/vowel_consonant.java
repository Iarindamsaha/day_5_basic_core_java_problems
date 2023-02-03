import java.util.Scanner;

public class vowel_consonant {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Character");
        char in = sc.next().charAt(0);
        if (in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u' || in == 'A' || in == 'E' || in == 'I' || in == 'O' || in == 'U'){
            System.out.println(in+"----->is a vowel");
        }
        else{
            System.out.println(in+"------>is a consonant");
        }
    }
}
