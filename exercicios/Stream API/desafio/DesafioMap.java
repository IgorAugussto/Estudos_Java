package desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inversao = binario -> new StringBuilder(binario).reverse().toString();
		Function<String, Integer> binarioParaInt = binario -> Integer.parseInt(binario, 2);
		
		nums.stream().map(Integer::toBinaryString)
		.map(inversao)
		.map(binarioParaInt)
		.forEach(System.out::println);
	}
}
