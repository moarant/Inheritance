package arant.molly.inheritance.petsPolymorphism;

/**
 * Created by mollyarant on 5/4/17.
 */
public class Pet {
    String petName;
    String petType;


    public Pet (String petName, String petType){
        this.petName= petName;
        this.petType= petType;

    }


    public String getPetName(){
        this.petName= petName;
        return petName;
    }


    public void setPetName(){
        this.petName= petName;
    }


    public String getPetType(){
        this.petType= petType;
        return petType;
    }


    public void setPetType(){
        this.petType= petType;
    }



}
