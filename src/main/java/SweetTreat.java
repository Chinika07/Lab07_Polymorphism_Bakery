import java.time.LocalDate;

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


    // Methods
    public String addTopping() {
        return "Candied Lemon";
    }

    public String addFilling() {
        return "Oreo Icing";
    }

    public String cakeShape() {
        return "Every cake that we sell are circular shaped.";
    }

    public abstract LocalDate useByDate();







        }
