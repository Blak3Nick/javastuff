/**
 * Created by Cyr1lfiggus1 on 10/23/2016.
 */
public class JavaLessonFourteen {

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();


        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);


        Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");
        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);
    }

}
