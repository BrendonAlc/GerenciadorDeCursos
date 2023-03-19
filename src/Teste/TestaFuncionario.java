package Teste;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Modelo.Funcionario;
import Modelo.OrdenarPorIdade;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Paulo", 25);
		Funcionario f2 = new Funcionario("Luiz", 60);
		Funcionario f3 = new Funcionario("Lucas", 45);
		

		//Criando lista com treeSet
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenarPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		//Utilizar iterator para buscar o próximo da lista
		Iterator<Funcionario> iterador = funcionarios.iterator();
		
		while (iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
			
		}
	}
}
