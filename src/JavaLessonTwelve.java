/**
 * Created by Cyr1lfiggus1 on 10/13/2016.
 */

import java.util.Arrays;
import java.util.LinkedList;
public class JavaLessonTwelve {
    public static void main(String[] args) {

        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();

        names.add("Ahmed Banny");
        names.add("Ali Said");

        names.addLast("Nathan Martin");
        names.addFirst("John Smith");

        names.add(0, "Noah Peters");

        names.set(2, "Paul Newman");

        names.remove(4);

        names.remove("Paul Newman");

        System.out.println("\nFirst Index " + names.get(0));

        for (String name : names ){
            System.out.println(name);
        }
        if(names.contains("Noah Peters")) {
            System.out.println("Noah Peters is here");
        }
        System.out.println("\nAli index at " + names.indexOf("Ali Said"));

        System.out.println("\nHow many " + names.size());

        System.out.println("\nGet without error " + names.peek());

    }

}
