import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to the Even or Odd Game!");
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is Even.");
            } else {
                System.out.println(num + " is Odd.");
            }
        }
    }
}
