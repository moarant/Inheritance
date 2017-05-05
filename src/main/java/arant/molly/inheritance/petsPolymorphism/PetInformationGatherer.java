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


public class PetInformationGatherer {
    
        ArrayList<Pet> petInformation = new ArrayList();



        Scanner petDescriber = new Scanner(System.in);
        System.out.println("Yo, how many pets you got? ");

        int amountOfPets = petDescriber.nextInt();

        String petTypes[] = new String[amountOfPets];
        String petNames[] = new String[amountOfPets];

    public boolean addPetToList() {

        for (int i = 0; i < amountOfPets; i++) {
            System.out.println("What kind of pet?");
            String typeOfPet = petDescriber.next();


            System.out.println("What is your pet's name?");
            String nameOfPet = petDescriber.next();

            petInformation.add(new Pet(nameOfPet, typeOfPet));
            return true;
        }
    }
//
//        for (int i = 0; i < amountOfPets; i++) {
//            System.out.println((i + 1) + " " + petTypes[i] + " " + petNames[i]);
//        }






}



//}
