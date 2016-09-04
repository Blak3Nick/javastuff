import java.util.Scanner;

public class javalesson2
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Your favorite number: ");

        if (userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();

            System.out.println("you entered " + numberEntered   );

            int numEnteredTimes2 = numberEntered + numberEntered;

            System.out.println(numberEntered +"+"+ numberEntered +"="+ numEnteredTimes2);

            numberEntered +=2;
            numberEntered -=2;
            numberEntered ++;


            int numberABS = Math.abs(numberEntered);
            System.out.println(numberABS);
            int whichIsBigger = Math.max(5,7);
            System.out.println(whichIsBigger);
        } else {

            System.out.print("Type a number stupid ");
        }
    }
}