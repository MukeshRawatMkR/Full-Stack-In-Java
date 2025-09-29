package ObjectOrientedProgramming;

//22 file

//If you don’t put an access modifier on a class in Java, it does not behave like public. It behaves like package-private (also called default access).

//class without modifier(default) = package-private.
//Only public classes can be imported outside their package into other package.

class AccessModifiers {

    public String lName;
    private String fName;

    public String getter() {
        return this.fName;
    }

    public void setter(String firstName) {
        this.fName = firstName;
    }

}
//public method in class -> can be accessed by other classes.
//private method in class -> can't be accessed by other classes.


//private member ->  can't be accessed by other classes, can only be accessed by getter and setter methods inside the same class or Access is possible inside the same class itself by any method but make sure they are public to be used by other classes.


//private access modifier -> declaration are accessible within the package or all subclasses.



/*
* So rule is consistent:
No modifier (default) → accessible only in the same package.
private → only inside same class.
protected → same package + subclasses (even if subclass is in another package).
public → everywhere.
*/