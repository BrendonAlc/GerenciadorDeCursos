package Teste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class testeAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Luciana Vieira");
		alunos.add("Juninho");
		alunos.add("Rildo da Silva");
		alunos.add("João Pedro");
		alunos.add("Juninho");
		
		System.out.println(alunos.size());

		boolean juninhoEstaMatriculado = alunos.contains("Juninho");
		alunos.remove("João Pedro"); // removendo aluno da lista
		System.out.println(juninhoEstaMatriculado);
		System.out.println(alunos.size());

		

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println(alunos);
	}
}
