package Arrays;

//14th file
public class Array {
    public static void main(String[] args) {

        //enhanced for loop with array.
        //two things to note about enhanced for loop
        //1. it never goes backward.
        //2. it's only used for reading not updating. i.e, Loop variable is read-only view. Reassigning it does not modify the original array.
        int[] num = {1, 2, 3};

        for (int val : num) {
            val = 2;
            System.out.println(val);
        }
        for (int val : num) {
            System.out.println(val);

        }
    }
}