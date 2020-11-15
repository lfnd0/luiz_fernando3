package br.ufal.aracomp.arvore;

public interface IArvore {
	public void inserirNo(No no);
	public int calcularAltura();
	public No buscarNo(String nome);
	public void mostrarEmOrdemAlfabetica();
	public double calcularMediaNotas();
}
