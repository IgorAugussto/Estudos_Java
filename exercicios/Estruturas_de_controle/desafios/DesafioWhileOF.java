package desafios;

import java.util.Scanner;

public class DesafioWhileOF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		double nota = 0;
		int quantidadeNotas = 0;
		
		while(nota != -1) {
			System.out.println("Digite sua nota.");
			System.out.println("E caso queira sair digite '-1'");
			nota = entrada.nextDouble();
						
			if(nota >= 0 && nota <= 10) {
			total += nota;
			quantidadeNotas++;
			}else if (nota != -1){
				System.out.println("Nota inválida!\n");
			}
		}
		
		entrada.close();
		
		double media = total / quantidadeNotas;
		System.out.println("A média é: " + media);
		
	}
}
