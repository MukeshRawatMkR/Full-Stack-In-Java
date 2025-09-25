package Arrays;

//15th file
public class RefOrVal {
    public static void main(String[] args){

        int[] arr={10,2,30};

        System.out.println(arr);
        int []arr1=arr;// here arr1 will be pointed to the same arr array, and whatever changes we do in arr1 it'll reflect to original array as well, bcz both points to same array.
        //Both references point to the same object on the heap.
        System.out.println(arr1);
        System.out.println(arr == arr1); // true

        arr1[1]=20;
        System.out.println(arr[1]);

    }
}


/*
When you pass an array to a method, what’s passed is the value of the reference (the memory address), not the actual array object.

Inside the method, both the caller and the callee refer to the same underlying array object, so modifications to elements reflect outside.

But if you reassign the parameter to a new array, that change does not affect the caller.
 */