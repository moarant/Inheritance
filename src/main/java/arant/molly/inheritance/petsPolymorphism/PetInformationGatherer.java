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




    public static void main(String[] args){
        Scanner petDescriber= new Scanner(System.in);
        System.out.println("How many pets do you have? ");

        int amountOfPets = petDescriber.nextInt();

        //String pets[][]= new String[amountOfPets][2];
        String petTypes[]= new String [amountOfPets];
        String petNames[]= new String [amountOfPets];


        for(int i = 0; i < amountOfPets; i++){
            System.out.println("What kind of pet?");
            String typeOfPet = petDescriber.next();

            System.out.println("What is your pet's name?");
            String nameOfPet = petDescriber.next();

//            String[] petInfo = new String[2];
//            petInfo[0] = typeOfPet;
//            petInfo[1] = nameOfPet;
//            pets[i] = petInfo;

            petTypes[i] = typeOfPet;
            petNames[i]= nameOfPet;
        }

        for(int i = 0; i < amountOfPets; i++){
            System.out.println((i+1) + " " + petTypes[i]+ " " + petNames[i]);
            //System.out.println((i+1)+ pets[i][i]);
        }
    }






}
