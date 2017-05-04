package arant.molly.inheritance.petsPolymorphism;

/**
 * Ask user how many pets they have.
 * Ask for the pet's type.
 * Ask for the pet's name.
 * Repeat based on number of pets.
 * Created by mollyarant on 5/4/17.
 */
import java.util.Scanner;

public class PetInformationGatherer {
   Scanner petDescriber= new Scanner(System.in);



    public int tellNumberOfPets(){
        System.out.println("Yo, how many pets you got? ");

        int amountOfPets = petDescriber.nextInt();
        return amountOfPets;

    }






}
