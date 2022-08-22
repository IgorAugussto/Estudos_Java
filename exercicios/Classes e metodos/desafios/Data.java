package desafios;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d",dia, mes, ano);
	}
	
	//Desafio contrutor, deixar o construtor padrão com valor padrão e outro contrutor recenbendo os parametros corretos
	
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}
