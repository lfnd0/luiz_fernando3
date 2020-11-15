package br.edu.lp3.arvore;

public interface ArvoreIF {

	public void adicionarNo(No no);

	public void imprimirArvore();

	public void imprimirArvorePreOrder();

	public void imprimirArvoreInOrderAsc();

	public void imprimirArvoreInOrderDesc();

	public void imprimirArvorePosOrder();
	
	public No buscarPrimeiroNo(String nome);
	
	public No buscarUltimoNo(String nome);
}