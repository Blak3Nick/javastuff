import java.util.Scanner;

public class JavaLessonFive {
    static double myPi = 3.14159; // Class Variable

    public static void main(String[] args)
    {
        System.out.println(addThem(1,2));
    }

    public static int addThem(int a, int b)
    {
        double smallPI = 3.140; // Local Variable only available here inside

        int c = a + b;

        tryToChange(6);
        return c;


    }

    public static void tryToChange (int d )
    {
        d = d+1;
        System.out.println(d);
    }

}