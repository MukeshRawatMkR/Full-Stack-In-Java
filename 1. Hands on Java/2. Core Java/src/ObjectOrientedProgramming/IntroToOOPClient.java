package ObjectOrientedProgramming;

//19the file
public class IntroToOOPClient {
    public static void main(String[] args){

        IntroToOOP mukesh=new IntroToOOP();
        System.out.println(mukesh);
        //Printing a reference (System.out.println(mukesh)) calls toString(). Default shows ClassName@hashCodeHex. This is not the actual heap address, just a hash.

        System.out.println(mukesh.name);
        mukesh.doingJob();

        IntroToOOP muki=new IntroToOOP();
        System.out.println(muki);
        System.out.println(mukesh.name);
        mukesh.doingJob();

        System.out.println(mukesh==muki);

    }
}

/*
Notes: How I can access my class file from client file?
Yes, it is related to package.
A package is just a namespace + a folder structure that groups classes.
As long as both .class files are compiled into the same package folder, they can “see” each other if access modifiers allow.
If they were in different packages, you’d need an import statement and possibly different access modifiers (public).
*/