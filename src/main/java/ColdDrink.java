import interfaces.IDrink;

import java.time.LocalDate;

public class ColdDrink extends Drink implements IDrink {

    private boolean kidsDrinks;
    private boolean softDrinks;
    private boolean milkshakes;

    public ColdDrink(String name, int price, boolean kidsDrinks, boolean softDrinks, boolean milkshakes){
        super(name, price);
        this.kidsDrinks = kidsDrinks;
        this.softDrinks = softDrinks;
        this.milkshakes = milkshakes;

    }


    // Methods

    public String drinks(String nameOfDrink){
        return nameOfDrink + " can come with a cookie or cupcake in our combo deals!";
    }

}
