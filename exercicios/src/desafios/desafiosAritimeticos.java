package desafios;

public class desafiosAritimeticos {
	public static void main(String[] args) {
		// Primeira operação do lado esquerdo da foto que está junto ao repositório
		int a_cima = 6 * (3 + 2);
		int a_cimaPotencia = (int) Math.pow(a_cima, 2);
		int a_baixo = 3*2;
		int a_total = a_cimaPotencia / a_baixo;
		System.out.println(a_total);
		
		// Operações do laod direito da imagem
		int b_cima = (1 - 5) * (2 - 7);
		int b_cimaPotencia1 = (int) Math.pow(b_cima, 2);
		int b_cimaPotencia2 = (int) Math.pow(2 , 2);
		int b_total = b_cimaPotencia1 / b_cimaPotencia2;
		System.out.println(b_total);
		
		//Resultado final do desafio
		int resultadoTotal1 = a_total - b_total;
		System.out.println(resultadoTotal1);
		
		int resultadoPotenciaCima = (int) Math.pow(resultadoTotal1, 3);
		int resultadoPotenciaBaixo = (int)Math.pow(10, 3);
		int resultadoDesafio = resultadoPotenciaCima / resultadoPotenciaBaixo;
		System.out.println(resultadoDesafio);
	}
}
