import java.util.Scanner;
public class JavaLessonFour {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
//        int i = 1;
//
//        while(i <= 20)y

//        {
//            if(i == 3)
//            {
//                i+=2;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//
//            if((i%2 == 0))
//            {
//                i++;
//            }
//
//            if(i>10)
//            {
//                break;
//            }
//
//        }
//
//        double myPi = 4.0;
//
//        double j = 3.0;
//
//        // 4 - 4/3 + 4/5 -4/7
//
//        while(j<100000)
//        {
//            myPi = myPi - (4/j) + (4/(j+2));
//            j += 4;
//            System.out.println(myPi);
//        }
//        System.out.println(Math.PI);

        String contYorN = "Y";

        int h = 1;

//        do
//        {
//            // executes once before checking the while parameter
//        }

        while (contYorN.equalsIgnoreCase("y"))
        {
            System.out.println(h);
            System.out.print("Continue y or no");
            contYorN = userInput.nextLine();
            h++;
        }


    }
}