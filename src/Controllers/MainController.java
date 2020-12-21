package Controllers;

import ImportData.ImportFruitAndVegatables;
import Products.Product;

import java.util.List;

public class MainController {
    ImportFruitAndVegatables importFruitAndVegatables = new ImportFruitAndVegatables();

    public void runProgram(){
        List <Product> productList = importFruitAndVegatables.fillListWithProducts();
        

    }
}
