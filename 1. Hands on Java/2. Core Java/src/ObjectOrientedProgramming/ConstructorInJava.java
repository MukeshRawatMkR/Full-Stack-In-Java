package ObjectOrientedProgramming;

//20th file
class Person {
    String name;

    Person() {//no arg constructor.
        System.out.println("Hello from Constructor!");
        name = "Mukesh Rawat";
    }

}

public class ConstructorInJava {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
    }
}

/*
NOtes:
- The constructor call happens at the new expression, before the reference is assigned.
- A constructor is used in the creation of an object that is an instance of a class. Constructors have the same name as the class and are invoked when an object is created using the new keyword.
- Has no return type (not even void).
- Purpose: set up the initial state of an object.
- Types of con...:
    1. Default constructor:
        If you don’t declare any constructor, Java provides one automatically.i.e, If your class has no constructor declared, javac automatically inserts a public no-argument constructor in the bytecode.
        It sets fields to default values (0, null, false).
        ex: class A {}
            A obj = new A();  // compiler inserts A() {}


    2. No-arg constructor
        Explicitly defined by developer.
        Useful when you want to control initialization without parameters.
        Ex: class B {
                B() {
                    System.out.println("No-arg constructor");
                }
            }


    3. Parameterized constructor
        Takes arguments for initialization.
        Ex: class C {
                int x;
                C(int value) {
                    x = value;
                }
            }


    4. Copy constructor (not built-in like C++, but common pattern)
        Initializes a new object by copying values from another object.
        Ex: class D {
                int x;
                D(D other) {
                    this.x = other.x;
                 }
            }

 */


/*

Key notes from official spec (JLS 8.8):

Constructors are not inherited.
Constructors can be overloaded.
Constructors can call another constructor in the same class using this(...).
Constructors can call a superclass constructor using super(...).

*/