package FunctionsAndMethodsInJava;


// 11th file
public class MethodOverloading {
    public static void main(String[]args){

        /*
        That concept is method overloading in Java.
        1. Same function name.
        2. Different parameter list (number, type, or order).
        3. Return type alone does not distinguish overloaded methods.,
        i.e, When Java decides which method to call, it looks only at the method name + parameter list (number, order, and types of parameters). The return type is ignored in this decision.         */

    }


    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }

}
// Note -> Java uses only pass-by-value.

//todo -> https://chatgpt.com/c/68d4c089-b01c-8325-947a-a3ad4936120a

//todo -> Armstrong Number (DSA).