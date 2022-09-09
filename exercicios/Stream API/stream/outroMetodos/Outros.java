package stream.outroMetodos;

import java.util.Arrays;
import java.util.List;

import stream.filter.Aluno;

public class Outros {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Sara", 9.0);
		Aluno a6 = new Aluno("Pedro", 8.1);
		Aluno a7 = new Aluno("Pedro", 8.1);
		Aluno a8 = new Aluno("Guto", 9.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit...");
		alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);
		
		System.out.println("\nTakeWhile...");//vai imprimir o valor "até que..." tal condição seja satisfeita.
		alunos.stream().distinct().skip(1).takeWhile(a -> a.nota >= 7).forEach(System.out::println);
		//Caso o skip caia em um aluno com a nota menor do que na condição, esse método não vai retornar nada como no 
		//exemplo acima.
	}
}
