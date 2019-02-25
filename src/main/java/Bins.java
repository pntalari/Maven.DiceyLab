import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Bins {

    private SortedMap<Integer,Integer> binTrackMap = new TreeMap<Integer, Integer>();

    public SortedMap<Integer, Integer> getBinTrack() {
        return binTrackMap;
    }

    public void setBinTrack(SortedMap<Integer, Integer> binTrack) {
        this.binTrackMap = binTrack;
    }

    public Bins(Integer numberOfDices, Integer numberOfTosses) {
        for (int i = numberOfDices; i <= (numberOfDices * 6); i++) {
            this.binTrackMap.put(i,0);
        }
    }

    public Bins()
    {

    }

    public Set binIncrement(Integer sumOfToss)
    {
        Integer result = this.binTrackMap.get(sumOfToss);
        this.binTrackMap.put(sumOfToss,result+1);
        return binTrackMap.entrySet();
    }

    public Integer getBin(int sumOfToss)
    {
        return this.binTrackMap.get(sumOfToss);
    }

    public Set<Map.Entry<Integer, Integer>> getBinList()
    {
        return this.binTrackMap.entrySet();
    }

}
