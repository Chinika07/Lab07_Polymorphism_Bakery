
import java.nio.charset.StandardCharsets;

public abstract class SweetTreat {

    protected String name;
    protected int price;

    public SweetTreat(String name, int price) {
        this.name = name;
        this.price = price;
    }

// Getters & Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
//    public void setTopping(String topping) {
//        this.topping = topping;
//    }


    // Methods
    public String addTopping() {
        return "Candied Lemon";
    }

    public String addFilling() {
        return "Oreo Icing";
    }

//        public void addSweetTreat(SweetTreat sweetTreat) {
//            this.sweetTreats.add(sweetTreat);





        }
