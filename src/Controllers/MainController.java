package Controllers;

import CashierPackage.Cashier;
import CashierPackage.ScanItems;
import ImportData.ImportFruitAndVegatables;
import Products.Product;

import java.util.List;
import java.util.Scanner;

public class MainController {
    ImportFruitAndVegatables importFruitAndVegatables = new ImportFruitAndVegatables();
    List <Product> productList = importFruitAndVegatables.fillListWithProducts();
    Cashier cashier = new Cashier();
    ScanItems scanItems = new ScanItems();
    public void runProgram(){
        int choice = 0;
        int logOutValue = 9; //If user enters logOutValue the program takes you to the login screen
        while (cashier.login() != false){
            System.out.println(scanItems.returnReceipt());
            System.out.println(scanItems.toString());
            if (scanItems.printRecieptAndPay() == false){
                scanItems.returnReceipt();
            } else if (scanItems.printRecieptAndPay() == true){
                scanItems.printRecieptAndPay();

            }
        }
    }
}
