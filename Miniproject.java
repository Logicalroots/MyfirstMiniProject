import java.util.Scanner;
import java.util.*;
public class Miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        System.out.println("Guess my number between (1-100)");
        int user;
        do {
            user = sc.nextInt();
            if (myNumber == user) {
                System.out.println("Yeah....You did a right guess and the number is "+ myNumber);
                break;

            } else if (myNumber > user) {
                System.out.print("You have guessed a too small number");
                System.out.println();
            } else if (myNumber < user) {
                System.out.print("You have guessed a too large number");
                System.out.println();
            }


        } while (user >= 0);
    }
}
