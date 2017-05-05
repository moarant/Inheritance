package arant.molly.inheritance.petsPolymorphism;

/**
 * Ask user how many pets they have.
 * Ask for the pet's type.
 * Ask for the pet's name.
 * Repeat based on number of pets.
 * Created by mollyarant on 5/4/17.
 */

import java.util.ArrayList;
import java.util.Scanner;


public class PetFactory {
    ArrayList<Pet> pets = new ArrayList();


    //TODO - Move this into a PetCreator.java class
    Scanner petDescriber = new Scanner(System.in);

    //TODO - Move this into a PetCreator.java class
    public Pet createPet() {
        System.out.println("What kind of pet?");
        String typeOfPet = petDescriber.next();


        System.out.println("What is your pet's name?");
        String nameOfPet = petDescriber.next();
        Pet pet = new Pet(nameOfPet, typeOfPet);
        return pet;
    }

    //TODO - Move this into a PetCreator.java class
    public Pet[] createPets() {
        System.out.println("How many pets would you like to create?");
        int numberOfPets = petDescriber.nextInt();
        Pet[] pets = new Pet[numberOfPets];
        for (int i = 0; i < numberOfPets; i++) {
            Pet newPet = createPet();
            pets[i] = newPet;
        }
        return pets;
    }

    /**
     * @param pet - the pet object to be added to the list
     */
    public void addPetToList(Pet pet) {
        String petType = pet.getPetType();
        String petName = pet.getPetName();
        System.out.println("Adding a new pet to the list...");
        System.out.println("The type of the pet is " + petType);
        System.out.println("The name of the pet is " + petName);

        pets.add(pet);
    }

    public void addPetsToList(Pet[] pets){
        for (int i = 0; i < pets.length; i++) {
            addPetToList(pets[i]);
        }
    }

    public ArrayList<Pet> getPetList() {
        return pets;
    }
}