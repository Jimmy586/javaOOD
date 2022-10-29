import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurgerTest {
    Burger burger;

    @BeforeEach
    void init (){
        burger = new Burger();
    }
    @Test
    @DisplayName("Testing price input and calculator")
    void priceCalculatorTest(){
        assertAll(
                ()->assertEquals(2.30, burger.priceCalculator(1), "should return always positive numbers"),
                ()-> assertEquals(0,burger.priceCalculator(0),"should return 0 for zero input"),
                ()->assertEquals(0,burger.priceCalculator(-19),"can't take a negative number")
        );
    }
}