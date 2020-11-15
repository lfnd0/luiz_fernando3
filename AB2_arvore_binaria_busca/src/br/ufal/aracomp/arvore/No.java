package br.ufal.aracomp.arvore;

public class No {
	private String nomeAluno;
	private double nota;
	private int numFaltas;
	
	private No esquerda;
	private No direita;
	
	
	public No(String nomeAluno, double nota, int numFaltas){
		this.nomeAluno = nomeAluno;
		this.nota = nota;
		this.numFaltas = numFaltas;
		
		this.esquerda = null;
		this.direita = null;
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public double getNota() {
		return nota;
	}
	
	public int getNumFaltas() {
		return numFaltas;
	}
	
	public No getEsquerda() {
		return esquerda;
	}
	
	public No getDireita() {
		return direita;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void setNumFaltas(int numFaltas) {
		this.numFaltas = numFaltas;
	}
	
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	
	public void setDireita(No direita) {
		this.direita = direita;
	}
	
	@Override
	public String toString() {
		return this.nomeAluno+"; Nota: "+this.nota +" ("+this.numFaltas+" faltas)";
	}
}
