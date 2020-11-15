package br.edu.lp3.lista;

public class ListaEstatica implements ListaEstaticaIF {

	private Aluno[] alunos;
	private int tamanho;

	public ListaEstatica(int tamanhoMaximo) {
		this.tamanho = 0;
		this.alunos = new Aluno[tamanhoMaximo];
	}

	@Override
	public void inserirInicio(Aluno aluno) {
		if (this.estaCheia()) {
			System.out.println("A lista está cheia!");
		} else {
			for (int i = this.tamanho - 1; i >= 0; i--) {
				this.alunos[i + 1] = this.alunos[i];
			}
			this.alunos[0] = aluno;
			this.tamanho++;
		}
	}

	@Override
	public void inserirFim(Aluno aluno) {
		if (this.estaCheia()) {
			System.out.println("A lista está cheia!");
		} else {
			this.alunos[this.tamanho] = aluno;
			this.tamanho++;
		}
	}

	@Override
	public void imprimir() {
		for (int i = 0; i < this.tamanho; i++) {
			System.out.println(this.alunos[i]);
		}
	}

	@Override
	public boolean estaVazia() {
		if (this.tamanho == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean estaCheia() {
		if (this.tamanho == this.alunos.length) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Aluno buscarAluno(int ordem) {
		if (ordem > 0 && ordem <= this.tamanho) {
			return this.alunos[ordem - 1];
		} else {
			return null;
		}
	}

	@Override
	public int buscarAluno(String nome) {
		int i = -1;
		for(i = 0; i < this.tamanho; i++) {
			if(this.alunos[i] != null && this.alunos[i].getNome().equals(nome)) {
				i++;
				break;
			}
		}
		return i;
	}
	
	@Override
	public Aluno retirarAluno(int ordem) {
		Aluno alunoTMP = this.buscarAluno(ordem);
		if (ordem > 0 && ordem <= this.tamanho) {
			for (int i = ordem - 1; i < this.tamanho - 1; i++) {
				this.alunos[i] = this.alunos[i + 1];
			}
			this.alunos[this.tamanho - 1] = null;
			this.tamanho--;
		}
		return alunoTMP;
	}

	@Override
	public void esvaziar() {
		this.alunos = new Aluno[this.alunos.length];
//		this.tamanho = 0;
	}

}