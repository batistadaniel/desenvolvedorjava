import java.util.Scanner;

public class AppEscola {
	public static void main(String args[]) {
		boolean temFaculdade = false;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = teclado.nextLine();

		System.out.print("Digite a sua idadee: ");
		int idade = teclado.nextInt();

		System.out.print("Tem falculdade: (0-nao e 1-sim) ");
		int temFaculdadeF = teclado.nextInt();
		teclado.close();

		if (temFaculdadeF == 0) {
			temFaculdade = false;
		} else if (temFaculdadeF == 1) {
			temFaculdade = true;
		}
		// boolean temFaculdadeF = temFaculdade.replace(0, "false");
		// teclado.close();
		// metodo principal
		// Classe objeto = new Construtor(parametros)

		Aluno aluno = new Aluno(nome, idade, temFaculdade);

		System.out.println(aluno.getNome());
		System.out.println(aluno.getIdade());
		System.out.println(aluno.getTemFaculdade());
		System.out.println(temFaculdadeF);

	}
}
