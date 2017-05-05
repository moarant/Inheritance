package arant.molly.inheritance;


import arant.molly.inheritance.petsPolymorphism.Pet;
import arant.molly.inheritance.petsPolymorphism.PetFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();

        petFactory.addPetsToList(petFactory.createPets());

        for(Pet pet : petFactory.getPetList()) {
            System.out.println(pet.speak());
        }

    }

}
