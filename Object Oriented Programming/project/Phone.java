/*
    Student Name: Conor Pasley
    Student No: R00205997
    Class: SDH2C
 */


package project;

enum Make {
    Samsung,
    Apple,
    Nokia
}

public class Phone extends Product{
    private Make make;
    private String model;
    private String storage;

    Phone(ProductDB productDB, String name,double price, Make make, String model, String storage){
        super(name, price);
        this.make = make;
        this.model = model;
        this.storage = storage;
        productDB.add(this);

    }
    //Setters
    public void setMake(Make make){
       this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setName(String name){
        super.name = name;
    }

    //Getters
    public Make getMake(){
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getStorage() {
        return this.storage;
    }

    public String getName(){
        return super.name;
    }

    public void print(){
        System.out.println(super.name + " " + this.make + " " + this.model + " " + this.storage);
    }

}

