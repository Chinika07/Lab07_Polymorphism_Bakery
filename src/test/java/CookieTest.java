import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CookieTest {


    Cookie cookie;

    @BeforeEach
    void setUp() {
        cookie = new Cookie("White Chocolate Chip Cookie", 4, "Large");
    }

    @Test
    void sizeOfCookie() {
        assertThat(cookie.sizeOfCookie()).isEqualTo("Large");
    }

    @Test
    void addFilling() {
        assertThat(cookie.addFilling()).isEqualTo("Melted White Chocolate");
    }

    @Test
    void getPrice() {
        assertThat(cookie.getPrice()).isEqualTo(4);
    }

    @Test
    void useByDate() {
        assertThat(cookie.useByDate()).isEqualTo(LocalDate.of(2023,2,12));
    }

    @Test
    void drinkAndCookie() {
        cookie = new Cookie("Smartie Cookie", 3, "Large");
        String result = cookie.drinks("Apple and Blackcurrent FruitShoot");
        assertThat(result).isEqualTo("A Smartie Cookie comes with an Apple and Blackcurrent FruitShoot" +
                " for an extra £2 ONLY!");

    }



}
