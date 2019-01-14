package program;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);
		double qtdNotas, somaNotas, nota, valorMedia;
		String continua;
		Aluno aluno1 = new Aluno();
		Escola logar = new Escola();
		
		logar.autentica();
		aluno1.escolaridade = aluno1.addEscolaridade();
		System.out.println("Escolaridade: "+aluno1.escolaridade);
		
		do {
			somaNotas = 0;
			nota = 0;
			valorMedia = 0;
			System.out.println("Quantas Notas a escola Utiliza para Média ? : ");
			qtdNotas = cs.nextDouble();
			for (int x = 1; x <= qtdNotas; x++) {

				System.out.println("Digite a " + x + "° nota: ");
				nota = cs.nextDouble();
				somaNotas = somaNotas + nota;
			}

			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o nome do Aluno: ");
			aluno1.nome = sc.nextLine();
			System.out.println("Digite a Idade do Aluno: ");
			aluno1.idade = sc.nextDouble();
			System.out.println("Digite a matricula do Aluno : ");
			aluno1.matricula = sc.nextDouble();
			System.out.println("Digite a Quantidade de Faltas: ");
			aluno1.faltas = sc.nextDouble();
			
			aluno1.addEscolaridade();
			aluno1.calcularMedia(aluno1.media, somaNotas, qtdNotas);
			aluno1.adicionarLista(aluno1.nome, aluno1.idade, aluno1.matricula, aluno1.faltas);

			System.out.println("Deseja Cadastrar outro Aluno (S/N) : ");
			continua = sc.next();

		} while (continua.toUpperCase().equals("S"));

		aluno1.listaDeAlunos();

	}

}