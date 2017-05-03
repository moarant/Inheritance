package arant.molly.inheritance.classManager;

import java.util.ArrayList;

/**
 * Created by mollyarant on 5/2/17.
 */
public class InventoryManager extends Product{
    ArrayList<Double> totalValue = new ArrayList();

    public double calculateValueOfProduct(double quantity, double price){
        double valueOfSingleType = quantity *price;
        return valueOfSingleType;
    }

    public boolean addValueToList(double singleTypeValue) {
        return totalValue.add(singleTypeValue);

    }

    public double calculateTotalValueOfProductsInInventory(ArrayList<Double> totalValue) {
        double totalValueOfAllProducts=0;
        for (int i = 0; i < totalValue.size(); i++) {
            totalValueOfAllProducts +=totalValue.get(i);

        }
        return totalValueOfAllProducts;


    }

}
