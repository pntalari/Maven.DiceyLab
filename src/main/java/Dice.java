import java.util.Random;

public class Dice {

    public int tossAndSum(int numberOfDices){

        Random ranNumber = new Random();
        Integer retSum = ranNumber.nextInt(numberOfDices*6) + 2;
        return retSum;
    }

}
