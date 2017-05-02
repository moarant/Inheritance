package arant.molly.inheritance;


import arant.molly.inheritance.ClassManager.InventoryManager;
import arant.molly.inheritance.ClassManager.Product;
import arant.molly.inheritance.HumansAndSuperHumans.Human;
import arant.molly.inheritance.HumansAndSuperHumans.SuperHuman;
import arant.molly.inheritance.RotateArray.Rotation;

public class Main
{
    public static void main( String[] args ) {
        Rotation rotation = new Rotation();
        InventoryManager manager= new InventoryManager();



//        ArrayList<Integer> numbers = new ArrayList();

        for (int i = 0; i < 7; i++) {
            rotation.add(i);

        }

        System.out.println("Before rotate: " + rotation);


        rotation.rotate(rotation, 2);



        Human molly= new Human ("Molly", 25, true, "Student", "123 Sesame Street");
        System.out.println(molly);

        SuperHuman heroIdentity= new SuperHuman ("Molly", 25, true, "Student", "123 Sesame Street", true, "unknown", "telekenesis" );
        System.out.println(heroIdentity);

        Product basketball = new Product ("Basketball", 25.00, 15);
        System.out.println(basketball);
        manager.calculateValueOfProduct(basketball.getQuantity(), basketball.getPrice());


        Product lamp = new Product("Lamp", 32.50, 10);
        System.out.println(lamp);
        manager.calculateValueOfProduct(lamp.getQuantity(), lamp.getPrice());




    }

}
