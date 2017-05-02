package arant.molly.inheritance.ClassManager;

/**
 * Created by mollyarant on 5/2/17.
 */
public class Product {
    double price;
    String id;
    double quantity;

    public Product(){

    }
    public Product( String id, double price, double quantity){
        this.id =id;
        this.price= price;
        this.quantity=quantity;
    }

    public double getPrice() {

        return this.price;
    }


    public void setPrice(double price) {
        this.price= price;
    }


    public String getId() {

        return this.id;
    }


    public void setId(String id) {
        this.id= id;
    }


    public double getQuantity() {

        return this.quantity;
    }


    public void setQuantity(double quantity) {
        this.quantity= quantity;
    }

    @Override
    public String toString(){
        return "Item name: " + this.id + "\nPrice of product: " + this.price + "\nNumber in stock: " + this.quantity;
    }

}
