import java.util.ArrayList;

public class Bakery {

    private ArrayList<SweetTreat> sweetTreats;

    public Bakery() {
        this.sweetTreats = new ArrayList<>();
    }

    // Methods

    public int countSweetTreats() {
        return this.sweetTreats.size();
    }

    public void addSweetTreat(SweetTreat sweetTreat) {
        this.sweetTreats.add(sweetTreat);
    }


}



