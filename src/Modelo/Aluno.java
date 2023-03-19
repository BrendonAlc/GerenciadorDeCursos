package Modelo;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome nao pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	//redefinindo comparacao do equals
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj; //utilizar cast do Object para receber na classe Aluno
		return this.nome.equals(outro.nome);
	}
	
	//Se realizar a redefinicao para o método equals, obrigatóriamente é necessário, redefir o método hashcode
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
}
