package br.ufal.aracomp.arvore.main;

import java.util.ArrayList;
import java.util.List;

import br.ufal.aracomp.arvore.ArvoreBinariaBusca;
import br.ufal.aracomp.arvore.No;
import br.ufal.aracomp.arvore.IArvore;

public class Principal {
	public static void main(String[] args) {
		/*
		 * Dada a implementação parcial da árvore binária apresentada, complemente a
		 * implementação de forma que o método principal execute corretamente
		 */

		IArvore arvore = new ArvoreBinariaBusca();
		System.out.println("-----------------------");
		System.out.println("Inserindo elemento na arvore...");
		arvore.inserirNo(new No("Joao Paulo Costa", 8.5, 2));
		arvore.inserirNo(new No("Carlos Alberto Nogueira", 8, 0));
		arvore.inserirNo(new No("Paulo Henrique Silva", 7.5, 1));
		arvore.inserirNo(new No("Luis Roberto Santos", 7.5, 0));
		arvore.inserirNo(new No("Alberto Furtado", 9.5, 0));
		arvore.inserirNo(new No("Patrick Oliveira", 3.5, 10));
		arvore.inserirNo(new No("Bruna Albuquerque", 8.75, 3));
		arvore.inserirNo(new No("Camila Assuncao", 7.5, 1));
		arvore.inserirNo(new No("Roberto Firmino", 4.5, 1));
		arvore.inserirNo(new No("Andreza Ferreira", 7.1, 1));
		System.out.println("   OK!");

		System.out.println("-----------------------");
		System.out.println("Altura da arvore gerada: " + (arvore.calcularAltura() - 1));
		System.out.println("-----------------------");
		System.out.println("Buscando alguns alunos...");
		List<String> listaNomes = new ArrayList<String>();
		listaNomes.add("Luis Roberto Santos");
		listaNomes.add("Roberta Olivenca Pereira");
		for (String nome : listaNomes) {
			System.out.println("   " + nome + "...");
			No no = arvore.buscarNo(nome);
			if (no != null) {
				System.out.println("      DADOS: " + no);
			} else
				System.out.println("      Nao encontrado!");
		}

		System.out.println("-----------------------");
		System.out.println("Lista de alunos da turma:");
		arvore.mostrarEmOrdemAlfabetica();
		System.out.println("-----------------------");
		System.out.println("Media de notas da turma: " + String.format("%.2f", arvore.calcularMediaNotas()));
	}
}