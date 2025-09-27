package ObjectOrientedProgramming;

//21th file

class PersonClass {
    private String name;
    private int age;

    PersonClass(String n, int a) {//parameterized constructor.
        name = n;
        age = a;
        System.out.println(name + " is " + age + " old!!");
        System.out.println("This one is parameterized constructor");
    }

    PersonClass() {//no-args constructor.
        System.out.println("This one is no-arg constructor");
    }

}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        PersonClass pc1 = new PersonClass();
        PersonClass pc2 = new PersonClass("Mukesh Rawat", 25);


    }
}
//Note: here we have two constructors so that is constructor overloading, which can be done.

