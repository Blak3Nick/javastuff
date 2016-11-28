/**
 * Created by Cyr1lfiggus1 on 10/23/2016.
 */
public class Animal {

    private String name = "Animal";
    public String favFood = "Food";

    protected final void changeName(String newName){
        this.name = newName;
    }
    protected final String getName() {
        return this.name;
    }
    public void eatStuff(){
        System.out.println("Yum" + favFood);
    }
    public void walkAround() {
        System.out.println(this.name + " walks around");
    }
    public Animal(){

    }
    public Animal(String name, String favFood){
        this.changeName(name);
        this.favFood = favFood;
    }
}