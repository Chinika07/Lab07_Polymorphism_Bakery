import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    TieredCake tieredCake;

    @BeforeEach
    void setUp() {
        tieredCake = new TieredCake("Oreo cake", 7,3,4);
    }

    @Test
    void canAddTopping() {
        assertThat(tieredCake.addTopping()).isEqualTo("Whipped cream and Oreos");
    }

    @Test
    void canAddTiers() {
        assertThat(tieredCake.addTiers()).isEqualTo("Two more tiers added");
    }

    @Test
    void canAddFilling() {
        assertThat(tieredCake.addFilling()).isEqualTo("Oreo Icing");
    }

    @Test
    public void numberOfLayersInCake() {
        assertThat(tieredCake.numberOfLayersInCake()).isEqualTo(4);
    }



}
