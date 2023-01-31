import java.time.LocalDate;

public class Cupcake extends SweetTreat {

    private String cupcakeBox;
    private String cupcakeSize;

    public Cupcake(String name, int price, String cupcakeBox, String cupcakeSize) {
        super(name, price);
        this.cupcakeBox = cupcakeBox;
        this.cupcakeSize = cupcakeSize;
    }

    // Method

    // Do I need these 2? As on the test page they are already stated in the @BeforeEach section??
    public String addCupcakeBox() {
        return "Box of six mini cupcakes"; }

    public String sizeOfCupcakes() {
        return "Mini cupcakes";
    }

    public void addCupcakeBox(String cupcakeBox) {
        this.cupcakeBox.concat(cupcakeBox); } // Can't use .add to a String, only to an ArrayList, List

    public LocalDate useByDate(){
        return LocalDate.of(2023,2,7);
    }

}
