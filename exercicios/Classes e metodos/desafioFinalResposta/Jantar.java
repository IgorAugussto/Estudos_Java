package desafioFinalResposta;

public class Jantar {
	public static void main(String[] args) {
		
		Comida comida1 = new Comida("Lasanha", 0.450);
		Comida sobremesa = new Comida("Sorvete de Flocos", 0.850);
		Pessoa p = new Pessoa("Amiltom", 80.00);
		
		System.out.println(p.apresentar());
		p.comer(comida1);
		System.out.println(p.apresentar());
		p.comer(sobremesa);
		System.out.println(p.apresentar());
	}
}
