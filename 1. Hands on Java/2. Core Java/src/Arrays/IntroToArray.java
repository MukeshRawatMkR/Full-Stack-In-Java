package Arrays;

//12th file
public class IntroToArray {
    public static void main(String[]args){

        //declaring an array.
        String names[];//c-style version
        String[] names2;//java style version.

        //allocating memory.
        names2=new String[10];
        names=new String[10];


        //declaring and allocating memory in single line.
        int []CGPA=new int[10];

        //initializing array during declaration.
        String[] skills= new String[]{"Java", "Spring Boot", "MySQL"};
        String[] skills2={"Java", "Spring Boot", "MySQL"};
        System.out.println("Total length: "+ skills.length);//to get the length of an array.
        String[] city=new String[10];
        System.out.println("city: " + city);//prints the address of array(1st element address).


        int[] phoneNo=new int[10];
        System.out.println("phoneNo: " + phoneNo);//[I@8efb846 -> [(array), I(index), post @ is the index of 1st number of array in memory.

        char[] grade=new char[10];
        System.out.println("Grade: " + grade);//[C@2a84aee7


        System.out.println("Done");
    }
}
