import java.util.Scanner;
public class TemperatureToday {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter today's temperature: ");
    int num = input.nextInt();

if (num < 15) {
    System.out.print("Cold");
    }

if (num >= 15 && num <=30) {
    System.out.print("Warm'");
    }

if (num > 30) {
    System.out.print("Hot'");
    }

}

}
