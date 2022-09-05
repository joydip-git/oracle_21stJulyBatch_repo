import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Programs {

	static <T> List<T> filter(List<T> input, FilterLogic<T> logic) {
		ArrayList<T> result = new ArrayList<T>();

		for (T element : input) {
			if (logic.applyLogic(element)) {
				result.add(element);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		List<Integer> numbers = Arrays.asList(arr);

		FilterLogic<Integer> evenLogic = (element) -> {
			return element % 2 == 0;
		};
		// FilterLogic<Integer> oddLogic = (element) -> element % 2 != 0;
		List<Integer> result = filter(numbers, evenLogic);

		Show printValues = (e) -> System.out.println(e);
		for (Integer num : result) {
			printValues.print(num);
		}

		Operations add = (a, b) -> (a + b);
		Operations subtract = (a, b) -> a - b;
		System.out.println(add.operate(12, 3));
		System.out.println(subtract.operate(12, 3));

		String[] names = new String[] { "akshat", "subhda", "rashi", "guneet" };
		List<String> nameValues = Arrays.asList(names);

		FilterLogic<String> nameLogic = (name) -> name.indexOf("g") != -1;
		List<String> filteredNames = filter(nameValues, nameLogic);
		filteredNames.forEach((n) -> System.out.println(n));

		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(12);
		values.add(1);
		values.add(13);
		values.add(2);

		Comparator<Integer> compare = (a, b) -> a.compareTo(b);
		values.sort(compare);
		values.forEach(n -> System.out.println(n));

	}

}
