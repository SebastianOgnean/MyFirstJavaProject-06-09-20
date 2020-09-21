package AnimalRescuer;

public class Food {
    private String animalFoodName ;
    private String stockAvailability ;
    private int quantity ;
    private float price ;

    public String getAnimalFoodNameName(){
        return animalFoodName;
    }
    public void setAnimalFoodNameName(String Name){
        this.animalFoodName = animalFoodName;
    }
    public String getStockAvailability(){
        return stockAvailability;
    }
    public void setStockAvailability(String stockAvailability){
        this.stockAvailability = stockAvailability;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice ( float price){
        this.price = price;
    }


}
