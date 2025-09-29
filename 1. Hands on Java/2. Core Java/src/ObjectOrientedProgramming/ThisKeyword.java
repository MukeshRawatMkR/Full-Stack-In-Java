package ObjectOrientedProgramming;


//23th file
//Todo -> Most Important.
class ThisKeyword {

    //This -> Used to refer to the current object inside a method or constructor.
    int var;

    ThisKeyword(int var) {
//application of 'this' keyword. below code: variable ambiguity.
        this.var = var;//what happens? -> obj/obj2.var
        System.out.println("This reference = " + this);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(10);
        System.out.println("Object Reference = " + obj);//first obj and obj2 is converted into string then returned.. i.e, internally it calls toString() method.

        ThisKeyword obj2 = new ThisKeyword(11);
        System.out.println("Object Reference = " + obj2);


    }

}


//Note -> https://chatgpt.com/c/68d7e036-a09c-8326-abe6-3bfe3ca0651b


//next file -> Another application of 'this' keyword is -> constructor overloading.