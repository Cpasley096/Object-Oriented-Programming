/*
    Student Name: Conor Pasley
    Student No: R00205997
    Class: SDH2C
 */

package project;

enum Type{
    LED,
    LCD;

}

public class  TV extends Product{
    private String make;
    private String model;
    private Type type;

    TV(ProductDB productDB,String name, double price, String make, String model, Type type){
        super(name, price);
        this.make = make;
        this.model = model;
        this.type = type;
        productDB.add(this);

    }
    //Setters
    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setName(String name){
        super.name = name;
    }

    //Getters
    public String getMake(){
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public Type getType() {
        return this.type;
    }

    public String getName(){
        return super.name;
    }

    public void print(){
        System.out.println(super.name + " " + this.make + " " + this.model + " " + this.type);
    }

}

