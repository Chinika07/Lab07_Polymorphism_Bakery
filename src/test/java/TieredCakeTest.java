import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    // Arrange:
    TieredCake tieredCake;

    @BeforeEach
    void setUp() {
        tieredCake = new TieredCake("Oreo cake", 7, 3, 4);
    }

    @Test
    void canAddTopping() {
        assertThat(tieredCake.addTopping()).isEqualTo("Whipped Cream and Oreos");
    }

    @Test
    void canAddTiers() {
        tieredCake.addTiers(1);      // Act
        int actual = tieredCake.getNumberOfTiers();
        int expected = 4;
        assertThat(actual).isEqualTo(expected); // Assert
    }

    @Test
    void canAddFilling() {
        assertThat(tieredCake.addFilling()).isEqualTo("Oreo Icing");
    }

    @Test
    public void numberOfLayersInCake() {
        assertThat(tieredCake.getNumberOfLayers()).isEqualTo(4);
    }

    // Overloading
    @Test
    public void cakeShape__noArgument() {
        String expected = "Every cake that we sell are circular shaped.";
        assertThat(tieredCake.cakeShape()).isEqualTo(expected);
    }

    @Test
    public void cakeShape__withArgument() {
        String expected = "Well actually, that was a lie because that tiered cake in the window is square shaped.";
        assertThat(tieredCake.cakeShape("that tiered cake in the window is square shaped")).isEqualTo(expected);
    }

    @Test
    void useByDate() {
        assertThat(tieredCake.useByDate()).isEqualTo(LocalDate.of(2023, 2, 10));

    }


}
