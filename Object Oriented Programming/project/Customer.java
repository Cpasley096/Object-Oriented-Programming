/*
    Student Name: Conor Pasley
    Student No: R00205997
    Class: SDH2C
 */


package project;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String address;
    private Order order;

    Customer(String name, String address, Order order){
        this.order = order;
        this.name = name;
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void add(Order order) {
        this.order = order;
    }

    public Order get(){
        return this.order;
    }

    public void remove(){
        this.order= null;
    }

    public void showAll(){
        ArrayList<OrderDetails> details = order.getOrderDetails();
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("==============================");
        for (OrderDetails orderDetail : details){
            System.out.println("ProductID: " + orderDetail.getProduct().getProductID());
            System.out.print("Product: ");
            orderDetail.getProduct().print();
            System.out.println("Quantity: "+ orderDetail.getQuantity());
            System.out.println("Total price: "+ orderDetail.getProduct().getPrice() * orderDetail.getQuantity());
            System.out.println("==============================");

        }
    }

}
