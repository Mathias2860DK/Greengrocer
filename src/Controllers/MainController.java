package Controllers;

import CashierPackage.Cashier;
import CashierPackage.ScanItems;
import ImportData.ImportFruitAndVegatables;
import Products.Product;

import java.util.List;
import java.util.Scanner;

public class MainController {
    public ImportFruitAndVegatables importFruitAndVegatables = new ImportFruitAndVegatables();
    Scanner scanner;
    Cashier cashier = new Cashier();
    public List <Product> productList = importFruitAndVegatables.fillListWithProducts();
    ScanItems scanItems = new ScanItems();


    public void runProgram(){

        scanner = new Scanner(System.in);
        int choice = 0;
        int logOutValue = 9; //If user enters logOutValue the program takes you to the login screen
        cashier.login();

        while (choice != logOutValue){
            System.out.println(scanItems.returnReceipt());


        }


    }
}
