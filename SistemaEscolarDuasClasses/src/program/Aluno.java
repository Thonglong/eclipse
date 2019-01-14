package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
	
public enum Escolaridade {
		
		FUNDAMENTAL, MEDIO, SUPERIOR, OUTRO
	}
	
	String nome;
	String escolaridade;
	double idade;
	double matricula;
	double faltas;
	double media;

	List<String> listNome = new ArrayList<String>();
	List<Double> listIdade = new ArrayList<Double>();
	List<Double> listMedia = new ArrayList<Double>();
	List<Double> listMatricula = new ArrayList<Double>();
	List<Double> listFaltas = new ArrayList<Double>();
	List<Escolaridade> listEscolaridade = new ArrayList<Escolaridade>();

	void calcularMedia(double resultado, double x, double y) {
		resultado = x/y;
		listMedia.add(resultado);
	}

	void adicionarLista(String no, double ida, double mat, double fal) {

		listNome.add(no);
		listIdade.add(ida);
		listMatricula.add(mat);
		listFaltas.add(fal);
	}

	void listaDeAlunos() {

		for (int x = 0; x < listNome.size(); x++) {

			System.out.println(" Aluno: " + listNome.get(x));
			System.out.println(" Idade: " + listIdade.get(x));
			System.out.println(" Matricula: " + listMatricula.get(x));
			System.out.println(" Faltas: " + listFaltas.get(x));
			System.out.println(" Média: " + listMedia.get(x));

		}
	}
	
	String addEscolaridade(){
		Scanner cs = new Scanner(System.in);
		System.out.println("Digite Sua escolaridade 1 - Fundamental, 2 - Medio, 3 - Superior: ");
		String verifica = cs.nextLine();
		
		if(verifica == "1"){
		listEscolaridade.add(Escolaridade.FUNDAMENTAL);
			return "Fundamental";
		}
		if(verifica == "2"){
			listEscolaridade.add(Escolaridade.MEDIO);
			return "Medio";
		}
		if(verifica == "3"){
			listEscolaridade.add(Escolaridade.SUPERIOR);
			return "superior";
		}
		if(verifica == null){
			
		return "Outro";
		}

}
}
