package Controllers;

import CashierPackage.Cashier;
import ImportData.ImportFruitAndVegatables;
import Products.Product;

import java.util.List;
import java.util.Scanner;

public class MainController {
    ImportFruitAndVegatables importFruitAndVegatables = new ImportFruitAndVegatables();
    Scanner scanner;
    Cashier cashier = new Cashier();

    public void runProgram(){
        List <Product> productList = importFruitAndVegatables.fillListWithProducts();
        scanner = new Scanner(System.in);
        int choice = 0;
        int logOutValue = 9; //If user enters logOutValue the program takes you to the login screen
cashier.login();
        while (choice != logOutValue){


        }


    }
}
