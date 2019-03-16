import java.util.*;

public class Simulation {

    private int numberOfDices = 0;
    private int numberOfTosses = 0;
    int sumOfToss = 0;
    Set binSet = new HashSet();

    Random random = new Random();



    private Set<String> binTrackMap = new TreeSet<String>(binSet);


    public int getRandomSum() {
        return sumOfToss;
    }

    public void setRandomSum(int randomSum) {
        this.sumOfToss = randomSum;
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 2);
        sim.runSimulation();
        Bins bin = new Bins();
        System.out.println("The Bin List: " + bin.getBinList());
    }

    private void runSimulation() {

        Dice dice = new Dice(4);
        Bins binTracker = new Bins(this.numberOfDices, this.numberOfTosses);

        for (int i = 1; i <= this.numberOfTosses; i++) {
            sumOfToss = dice.tossAndSum(this.numberOfDices);
            binSet = binTracker.binIncrement(sumOfToss);
          
        }
    }

    public Simulation(int numberOfDices, int numberOfTosses) {
        this.numberOfDices = numberOfDices;
        this.numberOfTosses = numberOfTosses;
    }

    public Simulation() {
        this.numberOfDices = 0;
        this.numberOfTosses = 0;
    }

    public int getNumberOfDices() {
        return numberOfDices;
    }

    public void setNumberOfDices(int numberOfDices) {
        this.numberOfDices = numberOfDices;
    }

    public int getNumberOfTosses() {
        return numberOfTosses;
    }

    public void setNumberOfTosses(int numberOfTosses) {
        this.numberOfTosses = numberOfTosses;
    }

}
