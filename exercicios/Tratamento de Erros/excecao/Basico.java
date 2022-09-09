package excecao;

public class Basico {
	
	public static void main(String[] args) {
	//"Alt + Shift + Z" é usado para atalho do "try...cath" para ratamento de erro
		
		Aluno aluno = null;
		
		try {
			imprimirNomdeAluno(aluno);
		} catch (Exception e) {
			System.out.println("Ocorrei um erro no momento de imprimir o nome do usuário");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		System.out.println("Fim :)");		
	}
	
	public static void imprimirNomdeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
