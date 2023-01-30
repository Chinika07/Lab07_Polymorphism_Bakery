import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


}
