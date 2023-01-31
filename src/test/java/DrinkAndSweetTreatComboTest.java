import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkAndSweetTreatComboTest {

    DrinkAndSweetTreatCombo drinkAndSweetTreatCombo;
    Cookie cookie;
    Cupcake cupcake;


    @Test
    public void canAddCookieToDrinkAndSweetTreatCombo(){
        drinkAndSweetTreatCombo = new DrinkAndSweetTreatCombo("Large cup of freshly made Pink Lemonade " +
                "with 4 Large cookies");
        cookie = new Cookie("Ruby Chocolate Chip Cookies", 6, "Large");
        drinkAndSweetTreatCombo.addCookie(cookie);
        System.out.println(drinkAndSweetTreatCombo.getCookies());
    }

    @Test
    public void canAddCupcakeToDrinkAndSweetTreatCombo(){
        drinkAndSweetTreatCombo = new DrinkAndSweetTreatCombo("Small vanilla milkshake with 6 mini cupcakes");
        cupcake = new Cupcake("Oreo Cupcake", 8, "Box of six mini cupcakes", "Mini");
        drinkAndSweetTreatCombo.addCupcake(cupcake);
        System.out.println(drinkAndSweetTreatCombo.getCupcakes());
    }




    }





