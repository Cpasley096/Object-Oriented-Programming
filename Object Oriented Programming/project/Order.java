/*
    Student Name: Conor Pasley
    Student No: R00205997
    Class: SDH2C
 */

package project;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderDetails> orderDetails;

    Order(ArrayList<OrderDetails> orderDetails){
        this.orderDetails = orderDetails;
    }

    public ArrayList<OrderDetails> getOrderDetails() {
        return new ArrayList<>(orderDetails);
    }

    public  void add(Product product, int quantity){
        OrderDetails order = new OrderDetails(product, quantity);
        this.orderDetails.add(order);
    }
    public void remove(int productIndex){
        try {
            this.orderDetails.remove(productIndex);
        }catch (IndexOutOfBoundsException e){
            System.out.println("There is no other detail at this index! ");

        }
    }

    public OrderDetails find(int productIndex){
        try {
            return this.orderDetails.get(productIndex);
        }catch (IndexOutOfBoundsException e){
            System.out.println("There is no other detail at this index! ");
            return null;
        }
    }

}
