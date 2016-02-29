package bathon.michael.reusingclasseslab3;

/**
 * Created by michaelbathon on 2/4/16.
 */
public class Product {

    public void setPrice(float x){
        this.price = x;
    }

    public float getPrice(){
        return this.price;
    }

    public void setId(String x){
        this.id = x;
    }

    public String getId(){
        return this.id;
    }

    public void setQuantity(float x){
        this.quantity = x;
    }

    public float getQuantity(){
        return this.quantity;
    }



    private float price;
    private String id;
    private float quantity;
}
