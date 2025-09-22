package OperatorsAndConditionalStatements;


//7th file

//check whether a triangle is valid or not
public class TriangleProblem {
    public static void main(String[]args){

        int t1 = 90 , t2= 0,t3= 90;
        if((t1>0&&t2>0&&t3>0)&&((t1+t2+t3)==180)){
            System.out.println("valid Traingle");
        }
        else{
            System.out.println("Invalid Traingle");

        }



    }
}
