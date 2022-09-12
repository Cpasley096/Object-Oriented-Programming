/*
    Student Name: Conor Pasley
    Student No: R00205997
    Class: SDH2C
 */

package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    ProductDB productDB = new ProductDB();
        Product P1 = new Phone(productDB, "Galaxy 2",290.99,Make.Samsung, "S20", "64GB");
        Product P2 = new Phone(productDB,"Galaxy 1",290.99,Make.Samsung, "S20", "64GB");
        Product P3 = new Phone( productDB,"Galaxy 4",290.99,Make.Samsung, "S20", "64GB");
        Product P4 = new Phone( productDB,"Galaxy 3",290.99,Make.Samsung, "S20", "64GB");

        Product T1 = new TV(productDB,"Series 7",500,"Sony", "S1", Type.LCD);
        Product T2 = new TV(productDB,"Series 6",450,"Sony", "S2", Type.LCD);
        Product T3 = new TV(productDB,"Series 5",299.99,"Sony", "S3", Type.LED);

        OrderDetails od1 = new OrderDetails(P2, 5);
        OrderDetails od2 = new OrderDetails(T1, 2);
        OrderDetails od3 = new OrderDetails(T3, 1);

        ArrayList<OrderDetails> orderDetails = new ArrayList<>();
        orderDetails.add(od1);
        orderDetails.add(od2);
        orderDetails.add(od3);

        Order order = new Order(orderDetails);
        Customer customer = new Customer("Conor Pasley", "31 new lane", order);

//        order.remove(10);
        System.out.println(order.find(10));

        HashMap<Integer, Product> productsInDB = productDB.getCollectionOfProducts();
        displayDatabase(productsInDB);

    }

    private static void displayDatabase(HashMap<Integer, Product> productsInDB) {

        System.out.println();
       if(productsInDB.isEmpty()){
           System.out.println("Database is empty");
       } else {
           System.out.println("Products in Product database");
           System.out.println("==============================");
           for (Map.Entry element : productsInDB.entrySet()) {
               int key = (int) element.getKey();

               Product product = (Product) element.getValue();

               System.out.println("Product ID: " + key);
               System.out.println("Product Name: " + product.name);
               System.out.println();
           }
       }
    }
}


