package ImportData;

import Products.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImportFruitAndVegatables {
    List<Product> productList = new ArrayList<>();

    public List<Product> fillListWithProducts(){
        String filePath = "src/Resources/FruitAndVegetablesList.csv";
        String splitCsvBy = ",";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            line = bufferedReader.readLine(); //Reads the first line, without doing anything with it.
            while ((line = bufferedReader.readLine()) != null){
                String [] splitArray = line.split(splitCsvBy);
                Product product = new Product(splitArray[0],Double.parseDouble(splitArray[1]),Integer.parseInt(splitArray[2]));
                productList.add(product);
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file was not found ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(); //TODO: print why the IOException occurred.
            e.printStackTrace();
        }

        return productList;
    }

}
