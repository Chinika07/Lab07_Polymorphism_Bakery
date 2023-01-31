import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    void setUp() {
        cupcake = new Cupcake("Lemon Drizzle", 4,"Box of Four Cupcakes",
                "Large");
    }

    @Test
    void canAddTopping() {
        assertThat(cupcake.addTopping()).isEqualTo("Candied Lemon");
    }

    @Test
    void addCupcakeBox() {
        assertThat(cupcake.addCupcakeBox()).isEqualTo("Box of Six Mini Cupcakes");
    }

    @Test
    void sizeOfCupcakes() {
        assertThat(cupcake.sizeOfCupcakes()).isEqualTo("Mini Cupcakes");
    }

    @Test
    void useByDate() {
        assertThat(cupcake.useByDate()).isEqualTo(LocalDate.of(2023,2,7));

    }

    @Test
    void drinkAndCupcake() {
        cupcake = new Cupcake("Dark Chocolate Cupcakes", 4, "Box of Two Cupcakes",
                "Large");
        String result = cupcake.drinks("Vanilla Milkshake");
        assertThat(result).isEqualTo("Dark Chocolate Cupcakes come with a Vanilla Milkshake " +
                "which will be £7 in total.");
    }



}
