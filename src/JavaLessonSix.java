import java.util.*;
import java.io.*;
public class JavaLessonSix
{

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.print("How old are you?");
//        int age = checkValidAge();
//        //divideByZero(2);
//        if (age != 0) {
//            System.out.println("You are " + age + "years old30");
//        }
            getAFile("IntegerArray.txt");
    }
    public static void divideByZero(int a ) {
        try
        {
            System.out.println(a/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Nope");

            System.out.println(e .getMessage());

            System.out.println(e .toString());
        }
    }

    public static int checkValidAge(){
        try {
            return userInput.nextInt();
        }
        catch (InputMismatchException e) {
            userInput.next();
            System.out.println("Nope");
            return 0;
        }
    }
    public static void getAFile(String fileName) {
        try {
        FileInputStream file = new FileInputStream(fileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Can't find file");
        }
    }
}