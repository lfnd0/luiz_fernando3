package br.edu.lp3.lista;

public interface ListaIF {

	public void inserirNoInicio(Item item);

	public void inserirNoFim(Item item);

	public void imprimir();

	public boolean estaVazia();

	public Item buscarItem(String nome);

	public Item removerItem(String nome);
}