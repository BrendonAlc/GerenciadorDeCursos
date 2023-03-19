package Modelo;

import java.util.Comparator;

public class OrdenarPorIdade implements Comparator<Funcionario> {

	//comparador da idade de um funcionario com outro
	@Override
	public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
		return funcionario.getIdade() - outroFuncionario.getIdade();
	}
}
