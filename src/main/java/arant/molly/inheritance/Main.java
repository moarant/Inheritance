package arant.molly.inheritance;


import arant.molly.inheritance.petsPolymorphism.Pet;
import arant.molly.inheritance.petsPolymorphism.PetFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PetFactory pet = new PetFactory();

        pet.addPetsToList(pet.createPets());

    }

}
