package ObjectOrientedProgramming;

//28th file
abstract class LearningAbstractionUsingProductClass {
    protected String name;
    protected double price;

    public LearningAbstractionUsingProductClass(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //implementation of these abstract methods will be in subclasses.
    abstract double calculateDiscount();

    abstract double calculateTax();

    abstract double calculateShippingCost();

}



/*
Notes:
Abstraction in OOP exists to hide unnecessary implementation details and expose only the essential features of an object.
can be achieved using two ways:

1. Abstract classes
- We use abstract keyword to create abstract classes and methods.
- an abstract method does not have any implementation(no method body).
- a class containing abstract methods should be abstract.
- we can't create objects of an abstract classes.
- If there is any subclass made from base class(abstract class) then we dont have a choice to implement the abstract method from base class in our subclass, we do have to implement them in our subclass if the parent class is abstract class and has some abstract methods as well in it.
- To implement features of abstract class, we inherit subclasses from it and create objects of the subclasses.
- A subclass must override all the abstract methods of an abstract class.
- We can access the static attributes and methods of an abstract class using the reference of abstract class.



2. Interfaces
*/

//todo (abstraction, the 2nd pillar of OOP) -> https://chatgpt.com/c/68da95a7-66b8-8320-87d4-843705f73219