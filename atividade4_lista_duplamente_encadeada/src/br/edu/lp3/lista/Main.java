package br.edu.lp3.lista;

public class Main {

	public static void main(String[] args) {
		
		ListaIF lista = new ListaDuplamenteEncadeada();
		
		System.out.print("A lista está vazia: " + lista.estaVazia() + "\n\n");
		
		lista.inserirNoInicio(new Item("Gunner", 10));
		lista.inserirNoInicio(new Item("Michael", 10));
		lista.inserirNoFim(new Item("Logan", 10));
		lista.imprimir();
		
		lista.inserirNoInicio(new Item("Robb", 10));
		lista.inserirNoFim(new Item("George", 10));
		lista.inserirNoFim(new Item("Spencer", 10));
		lista.imprimir();
		
		lista.removerItem("Gunner");
		lista.imprimir();
		
		System.out.print("A lista está vazia: " + lista.estaVazia() + "\n\n");
	}
}