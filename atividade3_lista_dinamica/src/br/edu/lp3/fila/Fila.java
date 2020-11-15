package br.edu.lp3.fila;

import br.edu.lp3.lista.Item;
import br.edu.lp3.lista.ListaIF;

public class Fila {

	ListaIF lista;

	public Fila() {
		this.lista = null;
	}

	public void adicionar(Item item) {
		this.lista.inserirInicio(item);
	}

	public Item remover(String nome) {
		return this.lista.removerFim(nome);
	}
}