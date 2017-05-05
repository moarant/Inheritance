package arant.molly.inheritance;


import arant.molly.inheritance.petsPolymorphism.Pet;
import arant.molly.inheritance.petsPolymorphism.PetFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();

        //comment out next line to hide results  from lab parts 1-4 results.
        LabResults.printLabResults();


        petFactory.addPetsToList(petFactory.createPets());

        for(Pet pet : petFactory.getPetList()) {
            System.out.println(pet.speak());
        }

    }

}
