package br.edu.lp3.arvore;

public class No {

	private String nome;
	private No esquerda;
	private No direita;

	public No(String nome) {
		this.nome = nome;
		this.esquerda = null;
		this.direita = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}

	@Override
	public String toString() {
		return getNome();
	}
	
}