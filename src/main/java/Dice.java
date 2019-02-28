public class Dice {

    private Integer numberOfDices;
    private Integer[] diceArray;

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
