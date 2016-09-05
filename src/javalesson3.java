public class javalesson3 {
    public static void main(String[] args)
    {
        int randomNumber = (int) (Math.random() * 50);


        if (randomNumber < 25)
        {
            System.out.println("The random number is less than 25");
        }
        else if (randomNumber> 25)
        {
            System.out.println("the random number is greater than 25");
        }
        System.out.println(randomNumber);

        int valueOne = 1;

        int valueTwo = 2;

        int biggestValue = (valueOne > valueTwo ? valueOne : valueTwo);

        System.out.println(biggestValue);

        char theGrade = 'B';

        switch (theGrade)
        {
            case 'A':
                System.out.println("Great Job");
                break;
            case 'B':
                System.out.println("Okay....");
        }
    }
}