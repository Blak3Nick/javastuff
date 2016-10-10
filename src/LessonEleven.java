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

        System.out.println(names);

        for(String i : names)
        {
            System.out.println(i);
        }

        Iterator indivItems = names.iterator();

        while(indivItems.hasNext())
        {
            System.out.println(indivItems.next());
        }

        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);

        String paulYoung = "PAul Young";

        names.add(paulYoung);

        if(names.contains(paulYoung))
        {
            System.out.println("Paul is here");
        }

        if (names.containsAll(nameCopy))
        {
            System.out.println("Errything is here");
        }
        names.clear();
        if (names.isEmpty())
        {
            System.out.println("EMteeee");
        }

        Object[] moreNames = new Object[4];
        moreNames = nameCopy.toArray();

        System.out.println(moreNames);
    }





}
