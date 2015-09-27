import java.util.ArrayList;
import java.util.List;

/**
 * Class Main
 * @author COJEZ Arnaud, LEPRETRE Rémy
 *
 */


public class Main {
	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<Integer>();
		liste.add(5);
		liste.add(2);
		System.out.println(liste.get(0));
		liste.remove(0);
		System.out.println(liste.get(0));
		
	}
}
