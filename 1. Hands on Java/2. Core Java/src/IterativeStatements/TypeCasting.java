package IterativeStatements;

// 9th file
public class TypeCasting {

    //Without casting → compile-time error: if we try to insert any big data into short datatype.
    //With explicit cast → allowed, but data may be lost.
    public static void main(String[] args){
/*
        1. Widening (Implicit) Casting:
        Smaller type → larger type.
        Done automatically by the compiler.
        Safe, no data loss.
        Example:
*/
        int x = 10;
        double y = x;  // int → double
        System.out.println(y);


        /*
        2. Narrowing (Explicit) Casting
        Larger type → smaller type.
        Must be done manually with a cast operator.
        Risk of data loss or overflow.
        Example:
*/
        double a = 9.78;
        int b = (int) a;  // double → int
        System.out.println(b);

    }
}
/*
boolean → JVM-dependent, treated as 1-bit logically, but stored as 1 byte in practice.
byte → 8 bits → -128 to 127
short → 16 bits → -32,768 to 32,767
char → 16 bits → 0 to 65,535 (unsigned)
int → 32 bits → -2³¹ to 2³¹-1
float → 32 bits → ~6–7 decimal digits precision
long → 64 bits → -2⁶³ to 2⁶³-1
double → 64 bits → ~15 decimal digits precision
*/


/*
int x = 130;
byte y = (byte) x;
System.out.println(y); // prints -126
Want me to break down how 130 becomes -126 at the bit level?
bcz it follows circular effect.
*/