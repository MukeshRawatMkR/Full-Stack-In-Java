package ObjectOrientedProgramming;

//28th file
public class Electronics extends LearningAbstractionUsingProductClass {
    public Electronics(String name, double price) {
        super(name, price);//going to call the constructor of base class.
    }

    @Override
    double calculateDiscount() {
        return price * 0.1;
    }

    @Override
    double calculateTax() {
        return price * 0.15;
    }

    @Override
    double calculateShippingCost() {
        return 10.0;
    }
}
