package Products;

import CashierPackage.ScanItems;

import java.util.List;

public class Product {
    String name;
    double price;
    int barcode;


    public Product(String name, double price, int barcode){
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    public Product() {
    }

    public String toString (){
        return name + price;
    }

    public double getPrice() {
        return price;
    }

    public void printTotalPrice(){


    }

    public int getBarcode() {
        return barcode;
    }
}
