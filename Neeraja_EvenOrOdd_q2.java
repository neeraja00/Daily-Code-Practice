import java.util.*;
public class Neeraja_EvenOrOdd_q2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " is a Even number");
        } else {
            System.out.println(num + " is a Odd number");
        }
    }
}