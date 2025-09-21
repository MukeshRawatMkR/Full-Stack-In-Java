package OperatorsAndConditionalStatements;

//3rd file

import java.util.Scanner;
public class JavaInput {
    public static void main(String[] args){
        System.out.println("Hello " +"Mukesh Rawat");
        //JRE -> The JRE contains the essential classes required for a Java program to execute successfully.
        //One of them is Scanner(class) to take input from the user.
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int number = sc.nextInt();
        sc.nextLine();//Todo: why am I writing this line?
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();


        System.out.println("Your name: "+ fullName);

        System.out.println("Your entered: "+ number);

    }
}
/*
For more:

int → nextInt()
byte → nextByte()
short → nextShort()
long → nextLong()
float → nextFloat()
double → nextDouble()
boolean → nextBoolean()
String (one word, until space) → next()
String (whole line) → nextLine()
char → no direct method → use next().charAt(0)
*/

