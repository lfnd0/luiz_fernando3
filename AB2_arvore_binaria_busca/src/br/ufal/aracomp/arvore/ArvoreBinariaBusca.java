package br.ufal.aracomp.arvore;

public class ArvoreBinariaBusca implements IArvore {

	private No raiz;

	public ArvoreBinariaBusca() {
		this.raiz = null;
	}

	@Override
	/*
	 * Insere um no na Arvore. Utiliza o nome do aluno como critério de
	 * organização da árvore de busca.
	 */
	public void inserirNo(No no) {
		if (no != null) {
			if (this.raiz == null) {
				this.raiz = no;
			} else {
				// se menor ou igual
				if (no.getNomeAluno().compareTo(raiz.getNomeAluno()) <= 0) {
					raiz.setEsquerda(inserirNo(raiz.getEsquerda(), no));
				}
				// se maior
				else {
					raiz.setDireita(inserirNo(raiz.getDireita(), no));
				}
			}
		}
	}

	private No inserirNo(No subRaiz, No no) {
		if (subRaiz == null) {
			subRaiz = no;
		} else {
			if (no != null) {
				// se menor ou igual
				if (no.getNomeAluno().compareTo(subRaiz.getNomeAluno()) <= 0) {
					subRaiz.setEsquerda(inserirNo(subRaiz.getEsquerda(), no));
				}
				// se maior
				else {
					subRaiz.setDireita(inserirNo(subRaiz.getDireita(), no));
				}
			}
		}
		return subRaiz;
	}

	/*
	 * Calcula a altura da arvore e retorna o seu valor
	 */
	@Override
	public int calcularAltura() {
		return calcularAltura(raiz);
	}

	private int calcularAltura(No no) {
		if (no == null)
			return 0;
		int noEsquerdo = calcularAltura(no.getEsquerda());
		int noDireito = calcularAltura(no.getDireita());
		return Math.max(noEsquerdo, noDireito) + 1;
	}

	/*
	 * Busca e retorna o primeiro no da Arvore que possui o nome informado. Retorna
	 * null caso nao encontre.
	 */
	@Override
	public No buscarNo(String nome) {
		No no = null;
		if (raiz != null) {
			no = buscarNo(nome, raiz);
		}
		return no;
	}

	private No buscarNo(String nome, No no) {
		if (no != null) {
			if (no.getNomeAluno().equals(nome)) {
				return no;
			} else {
				No auxiliar = buscarNo(nome, no.getEsquerda());
				if (auxiliar == null) {
					auxiliar = buscarNo(nome, no.getDireita());
				}
				return auxiliar;
			}
		} else {
			return null;
		}

	}

	/*
	 * Mostra o valor dos nos da arvore, percorrendo-a em order alfabetica
	 */
	@Override
	public void mostrarEmOrdemAlfabetica() {
		mostrarInOrder(this.raiz);
	}

	private void mostrarInOrder(No subRaiz) {
		if (subRaiz != null) {
			mostrarInOrder(subRaiz.getEsquerda());
			System.out.println(subRaiz.getNomeAluno());
			mostrarInOrder(subRaiz.getDireita());
		}
	}

	/*
	 * Mostra o valor da media de notas de todos os alunos
	 */
	@Override
	public double calcularMediaNotas() {
		double media = calcularMediaNotas(raiz);
		int qtd = qtdNo(raiz);
		return media / qtd;
	}

	private double calcularMediaNotas(No raiz) {
		if (raiz == null)
			return 0;
		return (raiz.getNota() + calcularMediaNotas(raiz.getEsquerda()) + calcularMediaNotas(raiz.getDireita()));
	}

	private int qtdNo(No no) {
		if (no == null) {
			return 0;
		} else {
			return (qtdNo(no.getEsquerda()) + 1 + qtdNo(no.getDireita()));
		}
	}
}
