package arant.molly.inheritance;


import arant.molly.inheritance.HumansAndSuperHumans.Human;
import arant.molly.inheritance.RotateArray.Rotation;

import java.util.ArrayList;

public class Main
{
    public static void main( String[] args ) {
        Rotation rotation = new Rotation();


        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("before rotate: " + numbers);

        System.out.println(rotation.rotate(numbers, 4));


        Human molly= new Human ("Molly", 25, true, "Student", "123 Sesame Street");
        System.out.println(molly);
    }

}
