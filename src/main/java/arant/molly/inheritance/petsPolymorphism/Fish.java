package arant.molly.inheritance.petsPolymorphism;

/**
 * Created by mollyarant on 5/4/17.
 */
public class Fish extends Pet {

    public Fish(String petName, String petType){
        super(petName, petType);
    }

    @Override
    public String speak(){
        String greeting = "Blurp";
        return greeting;
    }
}
