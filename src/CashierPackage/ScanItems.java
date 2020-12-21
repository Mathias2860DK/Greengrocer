package CashierPackage;

import Controllers.MainController;
import Products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanItems {
MainController mainController = new MainController();
    List <Product> receipt = new ArrayList<>();
    Scanner scanner;
    Product product = new Product();

    public List <Product> returnReceipt(){
scanner = new Scanner(System.in);
int barcode = scanner.nextInt();
        System.out.println("scan items");
        product = getProductByBarcode(barcode);
        receipt.add(product);
        return receipt;
    }

    //TODO add exeptions when barcode is incorrect
    public Product getProductByBarcode(int barcode){
        Product product = null;

        for (Product product1 : mainController.productList){
            if (product1.getBarcode() == barcode){
                return product1;
            }
        }

return null;
    }

}
