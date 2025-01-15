import java.util.Scanner;
public class AddTwoNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the first number (x): ");
int x = scanner.nextInt();
System.out.print("Enter the second number (y): ");
int y = scanner.nextInt();

int sum = x + y;

System.out.println("Addition of " + x + " and " + y + " is " +
sum);
scanner.close();
}
}