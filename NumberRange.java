import java.util.Scanner;
public class NumberRange {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number: ");
    int range = input.nextInt();

if (range <= 100) {
    System.out.print("In range");
    }

if (range < 1) {
    System.out.print("Out of range");
    }
    

if (range > 100) {
    System.out.print("Out of range");
    }
    
}

}
