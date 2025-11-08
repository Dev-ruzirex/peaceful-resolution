import java.util.Scanner;
public class SampleUser {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String username = "peace_sammy";
    
    int pin = 123456;

    System.out.print("Enter your username: ");
    String entered_username = input.nextLine();

    System.out.print("Enter your 6 digit pin: ");
    int entered_pin = input.nextInt();

if (entered_username == username) {
    System.out.print("Login successful");
}

if (entered_pin == pin) {    
    System.out.print("Login successful");
}

else {
    System.out.print("Login failed");
}

    }
}
