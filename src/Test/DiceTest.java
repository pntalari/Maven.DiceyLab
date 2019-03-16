import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

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

    @Test
    public void testRoll(){

        Random fakeRandom = new Random(1L);
        Dice dice = new Dice(fakeRandom);
        // actualValue = dice.roll();

       Integer actualValue = dice.tossAndSum(3);
        Assert.assertEquals(new Integer(4), actualValue);

    }

}