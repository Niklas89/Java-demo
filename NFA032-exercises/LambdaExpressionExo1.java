package chapitre14;

import java.util.List;
import java.util.function.BiFunction;

public class LambdaExpressionExo1 {
	
	long count = 0;
	
	BiFunction<List<String>, String, Long> functionList = (maliste , monString) -> {
		maliste.forEach(element -> {
		    if(element.equals(monString)) {
		    	count++;
		    }  
		});
		return count;
	};
	
	
	private long count(List<String> list, String myString) {
		
		return functionList.apply(list, myString);
	}

	public static void main(String[] args) {
		
		List<String> list = List.of("hello", "world", "hello", "lambda");
		
		LambdaExpressionExo1 obj = new LambdaExpressionExo1();
	
		System.out.println(obj.count(list, "hello"));

	}
	
	
	/*
	private long count(List<String> list, String myString) {
		
		final long count[] = {0};
		
		BiFunction<List<String>, String, Long> functionList = (maliste , monString) -> {
			maliste.forEach(element -> {
			    if(element.equals(monString)) {
			    	count[0]++;
			    }  
			});
			return count[0];
		};
		
		return functionList.apply(list, myString);
	} */

}
