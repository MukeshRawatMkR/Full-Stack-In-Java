package Arrays;

//to use ArrayListCollection we must first have to import it.
import java.util.ArrayList;

//17th file
public class ArrayListCollection {
    public static void main(String[] args){

        ArrayList<String>arrayListOfString=new ArrayList<>();
        ArrayList<Integer>arrayListOfInt=new ArrayList<>();

        //to add elements towards the end:
        arrayListOfInt.add(5);
        arrayListOfInt.add(9);
        arrayListOfInt.add(1,7);//to add element at particular index.

//to check the size of the arrayList:
        System.out.println(arrayListOfInt.size());

        //to print the array list.
        System.out.println(arrayListOfInt);

        //to get the element in a particular index:
        System.out.println(arrayListOfInt.get(1));

        //to get the first element in a arraylist:
        System.out.println(arrayListOfInt.getFirst());//it requires no args.

//to update(replace) the value in a  particular index:
        arrayListOfInt.set(1,7);//1st parameter is index and 2nd one is the value we wanna update with.
        System.out.println(arrayListOfInt);


//to remove any value in a particular index:
        arrayListOfInt.remove(1);
        System.out.println(arrayListOfInt);

        System.out.println(arrayListOfInt.size());


        System.out.print("To iterate and print the elements on arrayList: ");
        for(int val:arrayListOfInt){
            System.out.print(val+ " ");
        }

        //todo (Note: why we need array List -> https://chatgpt.com/c/68d624d7-e6e4-832e-a917-d087d0be05d6)
    }
}
