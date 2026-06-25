
import java.util.* ;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num : ");
        long num = input.nextLong();
        long factorial = 1;
        while (num > 0) {
            factorial = factorial * num;
            num--;
        }
        System.out.println("Factorial = " + factorial);

    }
}
