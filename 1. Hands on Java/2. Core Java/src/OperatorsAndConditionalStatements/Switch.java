package OperatorsAndConditionalStatements;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

//sixth file
public class Switch {
    public static void main(String[]args){
        //switch in Java does not support float, double, or long (nor their wrappers Float, Double, Long).

        System.out.print("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       String result = switch(n%2){
            case 0 -> "Even Number";
            default -> "Odd Number";
        };
        System.out.println("The number is: " + result );
    }
}
/*
        switch (expression) {
            case value1:
                // code
                break;
            case value2:
                // code
                break;
    ...
            default:
                // code
        }
*/
//expression must be of type byte, short, char, int, String, enum, or their wrapper classes (since Java 7).


//Java14+ version of switch:
/*
int day = 3;
switch (day) {
        case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
default -> System.out.println("Invalid day");
}
*/
//(Java 14+ supports switch expressions with -> and yield.)

/*
String result = switch (day) {
    case 1, 2, 3 -> "Weekday";
    case 6, 7 -> "Weekend";
    default -> "Invalid";
};
 */

/*
int day = 3;
String type = switch (day) {
    case 1, 2, 3, 4, 5 -> "Weekday";
    case 6, 7 -> "Weekend";
    default -> {
        yield "Invalid day";  // needed when using block
    }
};
System.out.println(type);


 */