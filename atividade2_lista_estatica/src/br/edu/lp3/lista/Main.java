package br.edu.lp3.lista;

public class Main {

	public static void main(String[] args) {
		
		ListaEstaticaIF lista = new ListaEstatica(4);
		
		lista.inserirFim(new Aluno("Arya", 10.0f));
		lista.inserirFim(new Aluno("Sansa", 8.4f));
		lista.inserirInicio(new Aluno("Bran", 7.2f));
		lista.inserirFim(new Aluno("Jon", 8.7f));
		
		lista.imprimir();
		
		lista.inserirInicio(new Aluno("Robb", 7.8f));
		lista.inserirInicio(new Aluno("Rickon", 7.0f));
		
		System.out.println(lista.buscarAluno(1));
		System.out.println(lista.buscarAluno("Bran"));
		
		lista.retirarAluno(1);
		lista.imprimir();
		
		lista.esvaziar();
		lista.imprimir();
	}
}