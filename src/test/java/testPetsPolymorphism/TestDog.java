package testPetsPolymorphism;

import arant.molly.inheritance.petsPolymorphism.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mollyarant on 5/4/17.
 */
public class TestDog {

    @Test
    public void testDogSpeak() {
        Dog doggie = new Dog("Sir Doggin of Dogginton", "Dog");

        //given
        String expectedResult= "Woof";

        //when
        String actualResult= doggie.speak();

        //then
        assertEquals("This should return woof for a doggie", expectedResult, actualResult);

    }

}
