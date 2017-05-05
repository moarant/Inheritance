package testPetsPolymorphism;

import arant.molly.inheritance.petsPolymorphism.Pet;
import arant.molly.inheritance.petsPolymorphism.PetFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by mollyarant on 5/4/17.
 */
public class TestPetInformationGatherer {
    @Test
    public void addPetsToListTest() {
        // Given
        PetFactory petInformationGatherer = new PetFactory();
        Pet expectedPet = new Pet("Fred", "Pet");

        // When
        petInformationGatherer.addPetToList(expectedPet);
        ArrayList<Pet> pets = petInformationGatherer.getPetList();
        Pet rescuedPet = pets.get(0);

        // Then
        Assert.assertEquals(expectedPet, rescuedPet);
    }
}







//    @Test
//    public void checkAddedValueToListTest(){
//        PetFactory petInformation = new PetFactory();
//        ArrayList<String> addPetToList = new ArrayList();
//        addPetToList.add("Cat", "Joe");
//        addPetToList.add("Dog", "Ralph");
//        String aPet="Cat Henry";
//        addPetToList.add(aPet);
//        String expected = aPet;
//       String actual= addPetToList.get(2);
//
//        assertEquals("checking that pet was added", expected, actual, 0);
//
//    }

//}