package bathon.michael.reusingclasseslab3;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/4/16.
 */
public class SpecInventoryManager {

    Product testCereal;
    Product testMilk;
    Product testBread;


    ArrayList<Product> testInventoryArray;

    Inventory inventory = new Inventory();


    @Before
    public void setUp(){
        testCereal = new Product();
        testMilk = new Product();
        testBread = new Product();

        testInventoryArray = new ArrayList<Product>();

        testCereal.setPrice(5.59f);
        testCereal.setQuantity(50000);
        testCereal.setId("Cereal");

        testMilk.setPrice(3.49f);
        testMilk.setQuantity(115000);
        testMilk.setId("Milk");

        testBread.setPrice(2.89f);
        testBread.setQuantity(2300000);
        testBread.setId("Bread");





    }

    @Test
    public void testGetPrice(){
        float expectedTestVal = 2.89f;

        float actualTestVal = testBread.getPrice();

        assertEquals("Fails if the price retrieved by the getter isn't equal to the test value", expectedTestVal, actualTestVal, 0.0f);

    }

    @Test
    public void testGetId(){

        String testID = "Bread";

        String actualID = testBread.getId();

        assertEquals("Fails if the id returned is not equal to the expected ID", testID, actualID);

    }

    @Test
    public void testGetQuantity(){

        float testQty = 2300000f;

        float actualQty = testBread.getQuantity();

        assertEquals("Fails if returned quantity is not equal to the expected quantity", testQty, actualQty, 0.0f);

    }

    @Test
    public void testInventoryTrackerArray(){

        String testName = "Cereal";

        testInventoryArray.add(testBread);
        testInventoryArray.add(testCereal);
        testInventoryArray.add(testMilk);

        assertEquals("Fails if the Array isn't storing our products", testName, testInventoryArray.get(1).getId());



    }

    @Test
    public void testInventoryValueSumMethod(){

        testInventoryArray.add(testBread);
        testInventoryArray.add(testCereal);
        testInventoryArray.add(testMilk);

        float expectedInvSumVal = 7327850.0f;

       // float actualInvSumVal = inventory.sumInventoryValue(testInventoryArray);

        //assertEquals("Fails if the expected value for the total inventory is not equal to the actual", expectedInvSumVal, actualInvSumVal, 0.0);

    }




}
