public class Cupcake extends SweetTreat {

    private String cupcakeBox;
    private String cupcakeSize;

    public Cupcake(String name, int price, String cupcakeBox, String cupcakeSize) {
        super(name, price);
        this.cupcakeBox = cupcakeBox;
        this.cupcakeSize = cupcakeSize;
    }

    // Method
    public String addCupcakeBox() {
        return "Box of six mini cupcakes"; }

    public String sizeOfCupcakes() {
        return "Mini cupcakes";
    }



}
