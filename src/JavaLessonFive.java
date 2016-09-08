import java.util.Scanner;

public class JavaLessonFive {
    static double myPi = 3.14159; // Class Variable

    public static void main(String[] args)
    {
        addThem(1,2);
    }

    public static int addThem(int a, int b)
    {
        double smallPI = 3.140; // Local Variable only available here inside

        System.out.println(myPi);

        return 1;
    }
}