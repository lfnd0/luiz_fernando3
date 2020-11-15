package br.edu.lp3.lista;

public class Item {
	
	private String nome;
	private float nota;
	private Item anterior;
	private Item proximo;
	
	public Item(String nome, float nota) {
		this.nome = nome;
		this.nota = nota;
		this.proximo = null;
		this.anterior = null;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public Item getProximo() {
		return proximo;
	}

	public void setProximo(Item proximo) {
		this.proximo = proximo;
	}
	
	public Item getAnterior() {
		return anterior;
	}

	public void setAnterior(Item anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String toString() {
		return this.getNome() + " " + this.getNota();
	}
}