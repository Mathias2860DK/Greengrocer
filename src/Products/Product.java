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

    public String toString (){
        return name;
    }

}
