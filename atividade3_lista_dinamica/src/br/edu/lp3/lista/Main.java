package br.edu.lp3.lista;

public class Main {

	public static void main(String[] args) {
		
		ListaIF lista = new ListaDinamica();
		
		lista.inserirInicio(new Item("Gunner", 10));
		lista.inserirInicio(new Item("Spencer", 10));
		lista.inserirFim(new Item("Logan", 10));
		lista.inserirFim(new Item("Michael", 10));
		lista.inserirFim(new Item("Cay", 10));
		
		lista.imprimir();
		
		lista.retirarElemento("Michael");
		lista.imprimir();
		
		lista.removerInicio("Spencer");
		lista.imprimir();
		
		lista.removerFim("Cay");
		lista.imprimir();
		
		lista.retirarElemento("Logan");
		lista.imprimir();
	}
}