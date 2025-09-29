package ObjectOrientedProgramming;


//25th file
//todo -> what's the use case of it?
public class PassingObjectsToAMethodInASameClassUsingThisKeyword {

    private String fName;

    private String lName;


    PassingObjectsToAMethodInASameClassUsingThisKeyword(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        System.out.println(this.fName);
        System.out.println(this.lName);
        changeName(this);
        System.out.println(this.fName);
        System.out.println(this.lName);
    }

    public static void main(String[] args) {
        PassingObjectsToAMethodInASameClassUsingThisKeyword obj1 = new PassingObjectsToAMethodInASameClassUsingThisKeyword("Unkown", "null");

    }

    private void changeName(PassingObjectsToAMethodInASameClassUsingThisKeyword obj) {
        obj.fName = "Mukesh";
        obj.lName = "Rawat";
    }

}
