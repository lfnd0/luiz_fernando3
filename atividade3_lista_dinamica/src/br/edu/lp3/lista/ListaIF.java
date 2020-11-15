package br.edu.lp3.lista;

public interface ListaIF {

	public void inserirInicio(Item item);

	public void inserirFim(Item item);

	public void imprimir();
	
	public boolean estaVazia();

	public Item buscarItem(String nome);

	public boolean retirarElemento(String nome);
	
	public Item removerInicio(String nome);
	
	public Item removerFim(String nome);

	public void esvaziar();
}