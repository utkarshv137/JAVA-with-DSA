import java.util.*;
import java.util.Scanner ;
public class Conditional_Statments {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // if-else statment
        if (a > b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // else-if statment 
        if(a<b){
            System.out.println(false);
        }
        else if (a>b){
            System.out.println("true");
        }else{
            System.out.println("Default");
        }

        // Ternary Operator 
        boolean ans = (a>b)? true : false ;
        System.out.println(ans);

        // Switch-Case Statment 
        Scanner input = new Scanner(System.in) ;
        String day = input.next();

        switch (day) {
            case "monday":
                System.out.println("monday is bloody woking day");
                break;
            case "sunday":
                System.out.println("hehe its time to rock");
                break;
        
            default:
                System.out.println("i guess its another boring day");
                break;
        }
    }
}
