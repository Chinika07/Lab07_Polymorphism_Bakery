import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;


    @BeforeEach
    public void setUp() {
        bakery = new Bakery();
    }

    @Test
    void canAddSweetTreat() {
        SweetTreat sweetTreat = new Cupcake("Chocolate Cupcake",3,"Box of Four Cupcakes",
                "Small");
        bakery.addSweetTreat(sweetTreat);
        assertThat(bakery.countSweetTreats()).isEqualTo(1);

        }

        @Test
    void canAddSweetTreat2() {
        SweetTreat sweetTreat = new TieredCake("Victoria Sponge", 25, 2, 3);
        bakery.addSweetTreat(sweetTreat);

        SweetTreat sweetTreat2 = new TieredCake("Bisscoff cake", 30, 4, 8);
            bakery.addSweetTreat(sweetTreat2);
        assertThat(bakery.countSweetTreats()).isEqualTo(2);
        }





    }




