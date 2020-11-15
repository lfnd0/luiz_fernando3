package br.edu.lp3.pilha;

import br.edu.lp3.lista.Item;
import br.edu.lp3.lista.ListaIF;

public class Pilha {

	ListaIF lista;

	public Pilha() {
		this.lista = null;
	}
	
	public void adicionar(Item item) {
		this.lista.inserirInicio(item);
	}
	
	public Item remover(String nome) {
		return this.lista.removerInicio(nome);
	}
}