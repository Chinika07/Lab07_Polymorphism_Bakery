import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ColdDrinkTest {

    ColdDrink coldDrink;

    @BeforeEach
    void setUp() { coldDrink = new ColdDrink("Flake Milkshake",7,false, false,
            true, 1); }

//    @Test
//    void canAddToppingsToMilkshake() {
//        coldDrink.addToppingsToMilkshake(1);
//        int actual = coldDrink.getNumberOfToppingsOnMilkshake();
//        int expected = 2;
//        assertThat(actual).isEqualTo(expected);
//    }

    @Test
    void canAddToppingsToMilkshake() {
        coldDrink.addToppingsToMilkshake(1);
        int actual = coldDrink.getNumberOfToppingsOnMilkshake();
        int expected = 2;
        assertThat(actual).isEqualTo(expected);
    }


    @Test
    void drinkAndSweetTreat() {
        coldDrink = new ColdDrink("Kids Orange Juice",3,true,false,false,
                0);
        String result = coldDrink.drinks("Kids Orange Juice");
        assertThat(result).isEqualTo("Kids Orange Juice can come with a cookie or cupcake of your choice" +
                " in our combo deals!");

    }






}
