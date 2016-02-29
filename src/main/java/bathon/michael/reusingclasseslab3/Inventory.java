package bathon.michael.reusingclasseslab3;

import java.util.ArrayList;

/**
 * Created by michaelbathon on 2/4/16.
 */
public class Inventory {

    ArrayList<Product> inventoryTracker = new ArrayList<Product>();




    public void sumInventoryValue(ArrayList<Product> p){
        float totalInvValue = 0.0f;
        float productVal = 0.0f;

        for(int i = 0; i < p.size(); i++){
            productVal = p.get(i).getPrice() * p.get(i).getQuantity();
            totalInvValue += productVal;
            System.out.printf("The value of your " + p.get(i).getId() + " inventory is: $" + "%.2f\n", productVal);
        }
        System.out.printf("Your total inventory value is: $" + "%.2f",totalInvValue);

    }


}
