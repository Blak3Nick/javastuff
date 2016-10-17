/**
 * Created by Cyr1lfiggus1 on 10/17/2016.
 */

import java.util.Arrays;
public class JavaLesson13 {


    public static void main(String[] args) {
        String randomString = "Im a string";

        String havtaQuote = "He said, \"I'm a string inside\"";

        int numTwo = 2;

        System.out.println(randomString  + " " + havtaQuote);


        String upperCase = "BIG";

        String loweCase = "big";

        if (upperCase.equalsIgnoreCase(loweCase)) {

            System.out.println("Equal ignoring case");

        }

        String letter = "abcde";

        String moreLetters = "fghijklm";

        System.out.println(moreLetters.charAt(3));

        System.out.println(moreLetters.contains("abc"));

        System.out.println(moreLetters.contains("ghij"));

        System.out.println(moreLetters.length());
        System.out.println(moreLetters.replace("ghi", "first"));

        System.out.println(moreLetters);

        String[] letterArray  = letter.split("");

        System.out.println(Arrays.toString(letterArray));

        System.out.println(letter.substring(1,4));

        //Use to create a string without too much memory
        StringBuilder randSB = new StringBuilder("A new strinhg");

        System.out.println(randSB.append("again"));

    }
}
