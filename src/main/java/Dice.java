import java.util.Random;

public class Dice {

    private Integer numberOfDices;
    private Integer[] diceArray;
    private Integer face;
    private Integer maxFace;
    private Random random;

    public Dice(){
        this.face = 1;
        this.maxFace = 6;
    }

    public Dice(Random random){
        this.face = 1;
        this.maxFace = 6;
        this.random = random;
    }

    public Dice(Integer numberOfDices){
        this.numberOfDices = numberOfDices;
        this.diceArray = new Integer[numberOfDices];
        for(int i =0;i<numberOfDices;i++)
        {
            diceArray[i] = 1;
        }
    }

    public Integer tossAndSum(int numberOfDices) {
        Integer sum = 0;
        for (int i = 0; i < numberOfDices; i++) {
            Integer diceResult = (int)((Math.random()*6) +1);
            sum += diceResult;
            diceArray[i] = diceResult;
        }
        return sum;
    }

}
