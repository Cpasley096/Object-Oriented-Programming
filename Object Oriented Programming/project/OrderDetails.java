/*
    Student Name: Conor Pasley
    Student No: R00205997
    Class: SDH2C
 */
package project;

public class OrderDetails {
    private Product product;
    private int quantity;

    OrderDetails(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity()  {
        return this.quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
