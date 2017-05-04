package testPetsPolymorphism;

import arant.molly.inheritance.petsPolymorphism.Cat;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mollyarant on 5/4/17.
 */
public class TestCat {


    @Test
    public void testCatSpeak() {
        Cat kitty = new Cat("Sir Kittens", "Cat");

        //given
        String expectedResult= "Meow";

        //when
        String actualResult= kitty.speak();

        //then
        assertEquals("This should return meow for a kitty", expectedResult, actualResult);

    }
}
