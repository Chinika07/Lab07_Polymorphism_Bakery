import interfaces.IDrink;

import java.util.ArrayList;
import java.util.List;

public class DrinkAndSweetTreatCombo {

    private String name;
    private List<IDrink> cookies;
    private List<IDrink> cupcakes;

    public DrinkAndSweetTreatCombo(String name){
        this.name = name;
        this.cookies = new ArrayList<>();
        this.cupcakes = new ArrayList<>();
    }

    public void addCookie(IDrink cookies) {this.cookies.add(cookies);}
    public List<IDrink> getCookies(){
        return cookies;
    }

    public void addCupcake(IDrink cupcakes) {this.cupcakes.add(cupcakes);}
    public List<IDrink> getCupcakes(){
        return cupcakes;
    }




}
