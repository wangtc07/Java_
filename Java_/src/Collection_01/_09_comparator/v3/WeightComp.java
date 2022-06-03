package Collection_01._09_comparator.v3;

import java.util.Comparator;

public class WeightComp implements Comparator<Weight> {
    public int compare(Weight o1, Weight o2) {
		return (int) (o1.getWeight()*100 - o2.getWeight()*100);
	}
}
