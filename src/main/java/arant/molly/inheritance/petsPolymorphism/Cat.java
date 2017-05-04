package arant.molly.inheritance.petsPolymorphism;

/**
 * Created by mollyarant on 5/4/17.
 */
public class Cat extends Pet {

    public Cat(String petName, String petType){
        super(petName, petType);

    }
    @Override
    public String speak(){
        String greeting = "Meow";
        return greeting;
    }

}
