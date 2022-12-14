package area_estudoStatic;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		//Uso do "static" nos atributos da classe
		AreaCirc a1 = new AreaCirc(5);
		AreaCirc a2 = new AreaCirc(12);
		AreaCirc a3 = new AreaCirc(31);
		AreaCirc a4 = new AreaCirc(6473);
		AreaCirc a5 = new AreaCirc(76);
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(a3.area());
		System.out.println(a4.area());
		System.out.println(a5.area());
		
		System.out.println("\nOUTRO EXEMPLO DE FORMA DIFERENTE, PORÉM COM O MEMSO RESULTADO\n");
		
		//Uso do "static" no método da classe. Deixa o código mais curto, com menos linhas.
		System.out.println(AreaCirc.area(5));
		System.out.println(AreaCirc.area(12));
		System.out.println(AreaCirc.area(31));
		System.out.println(AreaCirc.area(6473));
		System.out.println(AreaCirc.area(76));
	}
}
