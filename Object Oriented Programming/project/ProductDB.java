/*
    Student Name: Conor Pasley
    Student No: R00205997
    Class: SDH2C
 */

package project;

import java.util.HashMap;

public class ProductDB {
    private  HashMap<Integer, Product> productDB = new HashMap<>();

    public void add(Product product){
        int productID = product.getProductID();
        productDB.put(productID, product);
    }

    public void remove(int productID){
        productDB.remove (productID);
    }

    public Product find(int productID){
        return productDB.get(productID);

    }

    public HashMap<Integer, Product> getCollectionOfProducts(){
        return new HashMap<>(this.productDB);
    }
}
