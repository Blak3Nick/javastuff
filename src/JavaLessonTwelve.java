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

        for (String name : names ){
            System.out.println(name);
        }

    }

}
