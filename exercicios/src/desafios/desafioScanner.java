package desafios;

import java.util.Scanner;

public class desafioScanner {
	public static void main(String[] args) {
		
		/*Desafio consiste em coletar a informação dos tres ultimos salarios de um funcionario e devolver e média, porém com
		 um detalhe de que o usiário pode usar como separador decimal tanto a "," como "."
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu primeiro salário: ");
		String valor1 = entrada.nextLine().replace(",", ".");
		System.out.println("\nDigite o seu segundo salário: ");
		String valor2 =entrada.nextLine().replace(",", ".");
		System.out.println("\nDigite o seu terceito salário: ");
		String valor3 = entrada.nextLine().replace(",", ".");
		entrada.close();
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		double soma = numero1 + numero2 + numero3;
		
		System.out.println("Média dos 3 salários é de : " + soma / 3);
		
		
		
		
	}
}
