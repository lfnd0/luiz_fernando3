package br.edu.lp3.lista;

public interface ListaEstaticaIF {

	public void inserirInicio(Aluno aluno);

	public void inserirFim(Aluno aluno);

	public void imprimir();
	
	public boolean estaVazia();

	public boolean estaCheia();

	public Aluno buscarAluno(int ordem);
	
	public int buscarAluno(String nome);

	public Aluno retirarAluno(int ordem);

	public void esvaziar();
}