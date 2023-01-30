public class Cookie extends SweetTreat{

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



}
