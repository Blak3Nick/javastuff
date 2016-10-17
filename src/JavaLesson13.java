/**
 * Created by Cyr1lfiggus1 on 10/17/2016.
 */
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
    }
}
