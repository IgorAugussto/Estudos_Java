package stream;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	public final static UnaryOperator<String> maiusculo = n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra = n -> n .charAt(0) + " ";
	
	public static String grito(String n) {
		return n + "!!!\n";
	}
}
