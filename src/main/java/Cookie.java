import interfaces.IDrink;

import java.time.LocalDate;

public class Cookie extends SweetTreat implements IDrink {

    private String size;

    public Cookie(String name, int price, String size) {
        super(name, price);
        this.size = size;
    }

    // Methods
    public String sizeOfCookie() {
        return this.size;
    }

    @Override
    public String addFilling() {
        return "Melted White Chocolate";
    }

    public int getPrice() {
      return this.price;
    }

    public LocalDate useByDate(){
        return LocalDate.of(2023,2,12);
    }

    public String drinks(String nameOfDrink){
        return "A " + this.name + " comes with an " + nameOfDrink + " for an extra £2 ONLY!";
    }



}
