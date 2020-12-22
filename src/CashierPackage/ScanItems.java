package CashierPackage;

import Controllers.MainController;
import ImportData.ImportFruitAndVegatables;
import Products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanItems {
    List <Product> receipt = new ArrayList<>();
    Scanner scanner;
    Product product = new Product();
    ImportFruitAndVegatables iFV = new ImportFruitAndVegatables();

    public List <Product> returnReceipt(){
scanner = new Scanner(System.in);
        System.out.println("scan items");
        int barcode = 0;
while (barcode != 99){
    barcode = scanner.nextInt();
    product = getProductByBarcode(barcode);
    receipt.add(product);
    System.out.println(product);
}
        System.out.println(receipt);
        return receipt;
    }

    public boolean printRecieptAndPay(){
        int paid = scanner.nextInt();
        receipt = returnReceipt();
        System.out.println(receipt);
        System.out.println("If custommer paid press 1");
        toString();
        if (paid == 1){
            return true;
        } else if (paid == 2){
            return false;
        }
        return false;
    }

    //TODO add exeptions when barcode is incorrect
    public Product getProductByBarcode(int barcode){
        Product product = null;
        List<Product> products = iFV.fillListWithProducts();

        for (Product product1 : products){
            if (product1.getBarcode() == barcode){
                product = product1;

            }
        }

return product;
    }

    @Override
    public String toString() {
        double result = 0;
        for (Product product : returnReceipt()) {
            result =+ product.getPrice();
        }
        return "" +
                "receipt=" + receipt + result +
                '}';
    }
}
