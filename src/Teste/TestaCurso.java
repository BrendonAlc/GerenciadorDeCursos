package Teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Modelo.Aula;
import Modelo.Curso;

class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Brendon Alcantara");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));
//		aulas.add(new Aula("Trabalhando com ArrayList", 21));
//		aulas.add(new Aula("Aprendendo OO com Java", 20));

		//System.out.println(javaColecoes.getAulas());

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());

		System.out.println(javaColecoes);
	}

}
