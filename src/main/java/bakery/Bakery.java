package bakery;

import drinks.Drink;
import sweetTreats.SweetTreat;

import java.util.ArrayList;

public class Bakery {

    private ArrayList<SweetTreat> sweetTreats;
    private ArrayList<Drink> drinks;

    public Bakery() {
        this.sweetTreats = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    // Methods

    public int countSweetTreats() {
        return this.sweetTreats.size();
    }

    public void addSweetTreat(SweetTreat sweetTreat) {
        this.sweetTreats.add(sweetTreat);
    }

    public int countDrinks(){
        return this.drinks.size();
    }
    public void addDrink(Drink drink){
        this.drinks.add(drink);
    }



}



