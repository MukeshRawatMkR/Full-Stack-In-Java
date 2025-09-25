package Arrays;

// 13th file
public class MoreAboutArray {
    public static void main(String[] args){

        int[]numberInt=new int[3];
        System.out.println((numberInt[0]));
        System.out.println((numberInt[1]));
        System.out.println((numberInt[2]));
//        System.out.println((number[3])); //array index out of bounds exception error.
//Note -> by default array stores 0 value in case of int.

        String[]numberString=new String[3];
        System.out.println((numberString[0]));
        System.out.println((numberString[1]));
        System.out.println((numberString[2]));
        //Note -> in case of String, the by default value is 'null'.

        float[]numberFloat=new float[3];
        System.out.println((numberFloat[0]));
        System.out.println((numberFloat[1]));
        System.out.println((numberFloat[2]));
        //Note -> in case of float, the by default value is '0.0'.


        //same for others as well.
    }
}
