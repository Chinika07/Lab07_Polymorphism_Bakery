package sweetTreats;

import interfaces.IDrink;

import java.time.LocalDate;

public class Cupcake extends SweetTreat implements IDrink {

    private String cupcakeBox;
    private String cupcakeSize;

    public Cupcake(String name, int price, String cupcakeBox, String cupcakeSize) {
        super(name, price);
        this.cupcakeBox = cupcakeBox;
        this.cupcakeSize = cupcakeSize;
    }

    // Method

    public String addCupcakeBox() {
        return "Box of Six Mini Cupcakes"; }

    public String sizeOfCupcakes() {
        return "Mini Cupcakes";
    }

    public LocalDate useByDate(){
        return LocalDate.of(2023,2,7);
    }

    public String drinks(String nameOfDrink){
        return this.name + " come with a " + nameOfDrink + " which will be £7 in total.";
    }

}
