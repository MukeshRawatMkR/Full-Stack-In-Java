package ObjectOrientedProgramming;

//22 file
public class AccessModifiersClient {
    public static void main(String[] args) {
        AccessModifiers a1 = new AccessModifiers();
        a1.lName = "Rawat";
        a1.setter("Mukesh");
        System.out.print(a1.getter());
        System.out.println(a1.lName);

    }
}
