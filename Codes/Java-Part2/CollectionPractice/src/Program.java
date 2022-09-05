import java.util.*;

/**
 * 
 */

/**
 * @author satarupa
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		ArrayList<String> names = new ArrayList<String>();
		names.add("Akshat");
		names.add("Subhda");
		names.add("Rashi");
		names.add("Guneet");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("\n");
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		*/
		TreeSet<String> set = new TreeSet<String>();
		set.add("Akshat");
		set.add("Subhda");
		set.add("Rashi");
		set.add("Guneet");
		set.add("Guneet");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
	}
}
