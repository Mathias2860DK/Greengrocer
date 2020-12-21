package Products;

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
        return name;
    }

    public int getBarcode() {
        return barcode;
    }
}
