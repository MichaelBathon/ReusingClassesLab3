package bathon.michael.reusingclasseslab3;

/**
 * Created by michaelbathon on 2/4/16.
 */
public class InventoryManager {

    public static void main(String[] args) {

        Product cereal = new Product();
        Product milk= new Product();
        Product bread= new Product();

        cereal.setPrice(5.59f);
        cereal.setQuantity(50000);
        cereal.setId("Cereal");

        milk.setPrice(3.49f);
        milk.setQuantity(115000);
        milk.setId("Milk");

        bread.setPrice(2.89f);
        bread.setQuantity(2300000);
        bread.setId("Bread");


        Inventory inv1 = new Inventory();

        inv1.inventoryTracker.add(cereal);
        inv1.inventoryTracker.add(milk);
        inv1.inventoryTracker.add(bread);

        inv1.sumInventoryValue(inv1.inventoryTracker);



    }






}
