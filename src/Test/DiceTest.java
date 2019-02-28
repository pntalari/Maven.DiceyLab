import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void tossAndSumTest() {
        //Given
        Integer numberOfDice = 4;
        Integer[] expectedArr = new Integer[numberOfDice];
        //When
        Dice diceObj = new Dice(numberOfDice);
        //Then
    }

}