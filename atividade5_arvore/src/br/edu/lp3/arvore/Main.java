package br.edu.lp3.arvore;

public class Main {
	public static void main(String[] arvorergs) {
		
		Arvore arvore = new Arvore();
		
		arvore.adicionarNo(new No("D"));
		arvore.adicionarNo(new No("B"));
		arvore.adicionarNo(new No("F"));
		arvore.adicionarNo(new No("A"));
		arvore.adicionarNo(new No("C"));
		arvore.adicionarNo(new No("E"));
		arvore.adicionarNo(new No("G"));
		
		System.out.println("Pre-order: ");
		arvore.imprimirArvorePreOrder();
		
		System.out.println("Pos-order: ");
		arvore.imprimirArvorePosOrder();
		
		System.out.println("In-order asc: ");
		arvore.imprimirArvoreInOrderAsc();
		
		System.out.println("In-order desc: ");
		arvore.imprimirArvoreInOrderDesc();
		
		System.out.println("Buscar primeiro nó: " + arvore.buscarPrimeiroNo("A"));
		
		System.out.println("Buscar primeiro nó: " + arvore.buscarPrimeiroNo("C"));
		
		System.out.println("Buscar último nó: " + arvore.buscarUltimoNo("G"));
		
		System.out.println("Buscar último nó: " + arvore.buscarUltimoNo("E"));
	}
}