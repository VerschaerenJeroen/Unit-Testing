package Exercise03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {

    private final Ingredient ingredient1 = new Ingredient("what");
    private final Ingredient ingredient2 = new Ingredient(0,"singular","plural");
    private final Ingredient ingredient3 = new Ingredient(1,"singular","plural");
    private final Ingredient ingredient4 = new Ingredient(2,"singular","plural","what");

    @Test
    public void zeroPortions() {
        String result = ingredient1.print(0);
        assertEquals("",result);
    }

    @Test
    public void noAmount() {
        String result = ingredient1.print(1);
        assertEquals("what naar smaak", result);
    }

    @Test
    public void zeroAmount() {
        String result = ingredient2.print(1);
        assertEquals("",result);
    }

    @Test
    public void noWhat() {
        String result = ingredient3.print(1);
        assertEquals("1 singular",result);
    }

    @Test
    public void amount2() {
        String result = ingredient4.print(1);
        assertEquals("2 plural what",result);
    }
}
