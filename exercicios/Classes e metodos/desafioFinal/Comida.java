package desafioFinal;

public class Comida {
	
	String nomeComida;
	double pesoComida;
	
	Comida(){
		
	}
	
	Comida(String nomeComida, double pesoComida){
		this.nomeComida = nomeComida;
		this.pesoComida = pesoComida;
	}
	
	double ComidaDoJantar(){
		return pesoComida;
	}
	
}
