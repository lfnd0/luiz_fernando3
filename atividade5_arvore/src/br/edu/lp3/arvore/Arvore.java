package br.edu.lp3.arvore;

public class Arvore implements ArvoreIF {

	private No raiz;

	public No adicionarNo(No no, No alvo) {
		if (alvo == null) {
			alvo = no;
		} else {
			if (no.getNome().compareToIgnoreCase(alvo.getNome()) <= 0) {
				alvo.setEsquerda(adicionarNo(no, alvo.getEsquerda()));
			} else {
				alvo.setDireita(adicionarNo(no, alvo.getDireita()));
			}
		}
		return alvo;
	}

	@Override
	public void adicionarNo(No no) {
		if (raiz == null) {
			this.raiz = no;
		} else {
			if (no.getNome().compareToIgnoreCase(raiz.getNome()) <= 0) {
				this.raiz.setEsquerda(adicionarNo(no, this.raiz.getEsquerda()));
			} else {
				this.raiz.setDireita(adicionarNo(no, raiz.getDireita()));
			}
		}

	}

	@Override
	public void imprimirArvore() {
		if (raiz != null) {
			imprimirSubArvore(raiz);
		}
	}

	private void imprimirSubArvore(No subRaiz) {
		if (subRaiz != null) {
			System.out.println(subRaiz.getNome());
			imprimirSubArvore(subRaiz.getEsquerda());
			imprimirSubArvore(subRaiz.getDireita());
		}
	}

	@Override
	public void imprimirArvorePreOrder() {
		if (raiz != null) {
			imprimirArvore();
		}
	}

	@Override
	public void imprimirArvoreInOrderAsc() {
		if (raiz != null) {
			imprimirSubArvoreInOrderAsc(raiz);
		}
	}

	private void imprimirSubArvoreInOrderAsc(No subraiz) {
		if (subraiz != null) {
			imprimirSubArvoreInOrderAsc(subraiz.getEsquerda());
			System.out.println(subraiz.getNome());
			imprimirSubArvoreInOrderAsc(subraiz.getDireita());
		}
	}

	@Override
	public void imprimirArvoreInOrderDesc() {
		imprimirSubArvoreInOrderDesc(raiz);
	}

	private void imprimirSubArvoreInOrderDesc(No subraiz) {
		if (subraiz != null) {
			imprimirSubArvoreInOrderDesc(subraiz.getDireita());
			System.out.println(subraiz.getNome());
			imprimirSubArvoreInOrderDesc(subraiz.getEsquerda());
		}
	}

	@Override
	public void imprimirArvorePosOrder() {
		if (raiz != null) {
			imprimirSubArvorePosOrder(raiz);
		}
	}

	private void imprimirSubArvorePosOrder(No subraiz) {
		if (subraiz != null) {
			imprimirSubArvorePosOrder(subraiz.getEsquerda());
			imprimirSubArvorePosOrder(subraiz.getDireita());
			System.out.println(subraiz.getNome());
		}
	}

	@Override
	public No buscarPrimeiroNo(String nome) {
		No no = null;
		if(raiz != null) {
			no = buscarPrimeiroSubNo(nome, raiz);			
		}
		return no;
	}

	private No buscarPrimeiroSubNo(String nome, No subNo) {
		if (subNo != null) {
			if (subNo.getNome().equals(nome)) {
				return subNo;
			} else {
				No auxNo = buscarPrimeiroSubNo(nome, subNo.getEsquerda());
				return auxNo;
			}
		} else {
			return null;
		}
	}

	@Override
	public No buscarUltimoNo(String nome) {
		No no = null;
		if(raiz != null) {
			no = buscarUltimoSubNo(nome, raiz);
		}
		return no;
	}
	
	private No buscarUltimoSubNo(String nome, No subNo) {
		if (subNo != null) {
			if (subNo.getNome().equals(nome)) {
				return subNo;
			} else {
				No auxNo = buscarUltimoSubNo(nome, subNo.getDireita());
				return auxNo;
			}
		} else {
			return null;
		}
	}
}