package ObjectOrientedProgramming;

//24th file

//Todo: Most important, and H/W -> why is it behaving like this, and what's the use of doing this shit?
public class ConstructorOverloading {
    private int a, b;

    private ConstructorOverloading(int a, int b) {
        System.out.println(" Entry to args constructor");
        this.a = a;
        this.b = b;
        System.out.println(" Exit from args constructor ");
    }

    private ConstructorOverloading(int a) {
//        System.out.println("Entry to 1 arg constructor ");
        this(a, a);
        System.out.println("Exit from 1 arg constructor ");
    }

    private ConstructorOverloading() {
//        System.out.println("Entry to No args constructor");
        this(0);
        System.out.println("Exit from No args constructor");
    }

    public static void main(String[] args) {
//        ConstructorOverloading c1 = new ConstructorOverloading(10, 7);
//        System.out.println(c1);
//        ConstructorOverloading c2 = new ConstructorOverloading(7);
//        System.out.println(c2);

        ConstructorOverloading c3 = new ConstructorOverloading();
        System.out.println(c3);
    }

    @Override
    public String toString() {
        return this.a + " + " + this.b;
    }

}


//next file: another application of 'this keyword' is passing object to a method in a same class.