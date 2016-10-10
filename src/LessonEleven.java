/**
 * Created by Cyr1lfiggus1 on 10/10/2016.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
public class LessonEleven {

    public static void main(String[] args) {
        ArrayList arrayListOne;

        arrayListOne = new ArrayList();

        ArrayList arrayListTwo = new ArrayList();

        ArrayList<String> names = new ArrayList<String>();

        names.add("John Smith");
        names.add("John Hanover");
        names.add("John The Man");

        names.add(2, "Jack Ryan");

        for(int i=0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }



        names.remove(3);

        for(int i=0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

    }
}
