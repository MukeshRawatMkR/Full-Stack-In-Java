package ObjectOrientedProgramming;

//28th file
public class OnlineStore {

    public static void main(String[] args) {
        LearningAbstractionUsingProductClass electronics = new Electronics("Smartphone", 500);

        LearningAbstractionUsingProductClass clothing = new Electronics("Shirt", 500);
        System.out.println(electronics.calculateTax());
        System.out.println(clothing.calculateShippingCost());


    }
}
