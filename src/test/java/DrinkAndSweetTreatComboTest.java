import drinks.DrinkAndSweetTreatCombo;
import sweetTreats.Cookie;
import sweetTreats.Cupcake;
import org.junit.jupiter.api.Test;

public class DrinkAndSweetTreatComboTest {

    DrinkAndSweetTreatCombo drinkAndSweetTreatCombo;
    Cookie cookie;
    Cupcake cupcake;


    @Test
    public void canAddCookieToDrinkAndSweetTreatCombo(){
        drinkAndSweetTreatCombo = new DrinkAndSweetTreatCombo("Freshly made Pink Lemonade with four Large cookies");
        cookie = new Cookie("Ruby Chocolate Chip Cookies", 6, "Large");
        drinkAndSweetTreatCombo.addCookie(cookie);
        System.out.println(drinkAndSweetTreatCombo.getCookies());
    }

    @Test
    public void canAddCupcakeToDrinkAndSweetTreatCombo(){
        drinkAndSweetTreatCombo = new DrinkAndSweetTreatCombo("Small vanilla milkshake with six mini cupcakes");
        cupcake = new Cupcake("Oreo SweetTreats.Cupcake", 8, "Box of six cupcakes", "Mini");
        drinkAndSweetTreatCombo.addCupcake(cupcake);
        System.out.println(drinkAndSweetTreatCombo.getCupcakes());
    }


    }





