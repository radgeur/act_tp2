import java.util.ArrayList;
import java.util.List;

/**
 * Class Couple, a couple of int
 * @author COJEZ Arnaud, LEPRETRE Rémy
 *
 */


public class Couple {
	//ATTRIBUTS
	private int first;
	private int second;
	
	//METHODS
	/* Constructor
	 * @param first int element of the couple
	 * @param second int element of the couple
	 */
	public Couple(int first, int second){
		this.first = first;
		this.second =  second;
	}
	
	/** Fusion of two List of Couple
	 * @param One List of Couple
	 * @param Second List of Couple
	 */
	public List<Couple> fusionList (List<Couple> One, List<Couple> Second) {
		List<Couple> fusionnedList = new ArrayList<Couple>();
		
		while (!One.isEmpty() && !Second.isEmpty()) {
			if (One.get(0).first <= Second.get(0).first) 
				fusionnedList.add(One.remove(0));
			else
				fusionnedList.add(Second.remove(0));
		}
		
		if (!One.isEmpty())
			fusionnedList.addAll(One);
		else
			fusionnedList.addAll(Second);
		
		return fusionnedList;
	}
}
