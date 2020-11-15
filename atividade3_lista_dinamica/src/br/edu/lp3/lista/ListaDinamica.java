package br.edu.lp3.lista;

public class ListaDinamica implements ListaIF {

	private Item primeiroItem;
	private Item ultimoItem;

	public ListaDinamica() {
		this.primeiroItem = null;
		this.ultimoItem = null;
	}

	@Override
	public void inserirInicio(Item item) {
		if (this.primeiroItem == null) {
			this.primeiroItem = item;
			this.ultimoItem = item;
		} else {
			item.setProximo(this.primeiroItem);
			this.primeiroItem = item;
		}
	}

	@Override
	public void inserirFim(Item item) {
		if (this.primeiroItem != null) {
			this.ultimoItem.setProximo(item);
			this.ultimoItem = item;
		} else {
			inserirInicio(item);
		}
	}

	@Override
	public void imprimir() {
		Item auxiliar = this.primeiroItem;
		while (auxiliar != null) {
			System.out.println(auxiliar.getNome() + " " + auxiliar.getNota());
			auxiliar = auxiliar.getProximo();
		}
		System.out.println("Fim da impressão!\n\n");
	}

	@Override
	public boolean estaVazia() {
		if (this.primeiroItem == null) {
			return true;
		} else {
			return false;
		}
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
	public boolean retirarElemento(String nome) {
		Item auxiliar = this.primeiroItem;
		Item anterior = this.primeiroItem;
		if (auxiliar.getNome().equals(nome)) {
			this.primeiroItem = this.primeiroItem.getProximo();
			return true;
		} else {
			while (auxiliar.getProximo() != null) {
				anterior = auxiliar;
				auxiliar = auxiliar.getProximo();
				if (auxiliar.getNome().equals(nome)) {
					if (auxiliar.getProximo() == null) {
						anterior.setProximo(null);
						this.ultimoItem = anterior;
					} else {
						anterior.setProximo(auxiliar.getProximo());
						auxiliar = null;
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public Item removerInicio(String nome) {
		Item auxiliar = this.primeiroItem;
		if (auxiliar.getNome().equals(nome)) {
			auxiliar = auxiliar.getProximo();
			this.primeiroItem = auxiliar;
		}
		return auxiliar;
	}

	@Override
	public Item removerFim(String nome) {
		Item auxiliar = this.primeiroItem;
		Item anterior = this.primeiroItem;
		if (auxiliar.getProximo() == null) {
			this.primeiroItem = null;
			this.ultimoItem = null;
		} else {
			while (auxiliar.getProximo() != null) {
				anterior = auxiliar;
				auxiliar = auxiliar.getProximo();
				if (auxiliar.getProximo() == null) {
					this.ultimoItem = anterior;
					ultimoItem.setProximo(null);
				}
			}
		}
		return anterior;
	}

	@Override
	public void esvaziar() {
		this.primeiroItem = null;
		this.ultimoItem = null;
	}
}