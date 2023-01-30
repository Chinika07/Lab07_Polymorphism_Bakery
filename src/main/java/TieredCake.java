public class TieredCake extends SweetTreat{

    private int numberOfTiers;
    private int numberOfLayers;

    public TieredCake(String name, int price, int numberOfTiers, int numberOfLayers) {
        super(name, price);
        this.numberOfTiers = numberOfTiers;
        this.numberOfLayers = numberOfLayers;
    }

    // Methods

    @Override
    public String addTopping() {
        return "Whipped cream and Oreos";
    }

    public String addTiers() {
        return "Two more tiers added";
    }

    public int numberOfLayersInCake() {
        return this.numberOfLayers;
    }




}
