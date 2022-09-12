/*
    Student Name: Conor Pasley
    Student No: R00205997
    Class: SDH2C
 */

package project;

public abstract class Product {
    private final int productID;
    protected String name;
    private String description;
    private double price;
    private static int numberOfProducts;

    Product(String name, double price){
        this.name = name;
        this.price = price;
        numberOfProducts ++;
        this.productID = numberOfProducts;
        
    }

    //Setters
    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(float price){
        this.price = price;
    }

    //getters
    public String getDescription(){
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getProductID(){
        return this.productID;
    }

    abstract public void print();
}
