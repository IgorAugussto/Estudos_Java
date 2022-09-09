package desafios.cliente;

public class ClienteTest {
	public static void main(String[] i) {
		
		Cliente cliente = new Cliente("Mario");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		//Adicionei os itens na lista de itens, porem ainda não adicionei os itens as compras
		compra1.adicionarItem("Caneta", 9.76, 100);
		compra1.adicionarItem("Notebook", 1500, 3);
		compra2.adicionarItem("Apontador", 5.60, 20);
		compra2.adicionarItem("Mouse", 69.90, 2);
		
		//Itens foram adicionados as compras
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.printf("Meu nome é %s e eu gastei R$%.2f em compras", cliente.nome, cliente.obterValorTotal_Compras());
		
	}
}
