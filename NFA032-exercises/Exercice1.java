package chapitre14;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Exercice1 {
	
	private long count(List<String> list, String myString) {
		
		BiFunction<List<String>, String, Integer> functionList = (maliste , monString) -> {
			final int count = 0;
			maliste.forEach(element -> {
			    if (element.contains(monString)) {
			        count++;
			    }
			});
			return count;
		};
		
		return functionList.apply(list, myString);
		
	}

	public static void main(String[] args) {
		
		
		List<String> list = List.of("hello", "world", "hello", "lambda");
		
		Exercice1 obj = new Exercice1();
		
	
		System.out.println(obj.count(list, "hello"));

	}

}
