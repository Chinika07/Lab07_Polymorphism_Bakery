import interfaces.IDrink;

import java.time.LocalDate;

public class ColdDrink extends Drink implements IDrink {

    private boolean kidsDrinks;
    private boolean softDrinks;
    private boolean milkshakes;
    private int numberOfToppingsOnMilkshake;

    public ColdDrink(String name, int price, boolean kidsDrinks, boolean softDrinks, boolean milkshakes,
                     int numberOfToppingsOnMilkshake){
        super(name, price);
        this.kidsDrinks = kidsDrinks;
        this.softDrinks = softDrinks;
        this.milkshakes = milkshakes;
        this.numberOfToppingsOnMilkshake = numberOfToppingsOnMilkshake;

    }


    // Getters & Setters

    public boolean getKidsDrinks() {
        return kidsDrinks;
    }

    public void setKidsDrinks(boolean kidsDrinks) {
        this.kidsDrinks = kidsDrinks;
    }

    public boolean getSoftDrinks() {
        return softDrinks;
    }

    public void setSoftDrinks(boolean softDrinks) {
        this.softDrinks = softDrinks;
    }

    public boolean getMilkshakes() {
        return milkshakes;
    }

    public void setMilkshakes(boolean milkshakes) {
        this.milkshakes = milkshakes;
    }

    public int getNumberOfToppingsOnMilkshake(){
        return numberOfToppingsOnMilkshake;
    }

    public void setNumberOfToppingsOnMilkshake(int numberOfToppingsOnMilkshake){
        this.numberOfToppingsOnMilkshake = numberOfToppingsOnMilkshake;
    }

    // Methods
    public String drinks(String nameOfDrink){
        return nameOfDrink + " can come with a cookie or cupcake of your choice in our combo deals!";
    }

    public void addToppingsToMilkshake(int numberOfToppingsToAdd){
        this.numberOfToppingsOnMilkshake+= numberOfToppingsToAdd;
    }

}
