package br.edu.lp3.lista;

public class ListaDuplamenteEncadeada implements ListaIF {

	private Item primeiroItem;
	private Item ultimoItem;

	public ListaDuplamenteEncadeada() {
		this.primeiroItem = null;
		this.ultimoItem = null;
	}

	@Override
	public void inserirNoInicio(Item item) {
		if (this.primeiroItem == null) {
			this.primeiroItem = item;
			this.ultimoItem = item;
		} else {
			this.primeiroItem.setAnterior(item);
			this.primeiroItem.getAnterior().setProximo(primeiroItem);
			this.primeiroItem = this.primeiroItem.getAnterior();
		}
	}

	@Override
	public void inserirNoFim(Item item) {
		if (this.primeiroItem == null) {
			this.primeiroItem = item;
			this.ultimoItem = item;
		} else {
			this.ultimoItem.setProximo(item);
			this.ultimoItem.getProximo().setAnterior(ultimoItem);
			this.ultimoItem = this.ultimoItem.getProximo();
		}

	}

	@Override
	public void imprimir() {
		Item auxiliar = this.primeiroItem;
		while (auxiliar != null) {
			System.out.println(auxiliar.getNome() + " " + auxiliar.getNota());
			auxiliar = auxiliar.getProximo();
		}
		System.out.print("Fim da impressão!\n\n");
	}

	@Override
	public boolean estaVazia() {
		if (this.primeiroItem == null) {
			return true;
		}
		return false;
	}

	@Override
	public Item buscarItem(String nome) {
		Item auxiliar = this.primeiroItem;
		while (auxiliar != null) {
			if (auxiliar.getNome().equals(nome)) {
				return auxiliar;
			}
			auxiliar = auxiliar.getProximo();
		}
		return null;
	}

	@Override
	public Item removerItem(String nome) {
		Item auxiliar = buscarItem(nome);
		if (auxiliar != null) {
			if (this.primeiroItem == this.ultimoItem) {
				this.primeiroItem = null;
				this.ultimoItem = null;
			} else if (auxiliar == this.primeiroItem) {
				this.primeiroItem = primeiroItem.getProximo();
				this.primeiroItem.setAnterior(null);
			} else if (auxiliar == this.ultimoItem) {
				this.ultimoItem = ultimoItem.getAnterior();
				this.ultimoItem.setProximo(null);
			} else {
				auxiliar.getAnterior().setProximo(auxiliar.getProximo());
				auxiliar.getProximo().setAnterior(auxiliar.getAnterior());
			}
		}
		return null;
	}
}