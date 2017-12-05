package models;

import java.util.ArrayList;

public class PilhaLabels {
	private int topo;
	private int valor;
	private ArrayList<Integer> pilha;
	
	public int pop() {
		int i = (valor - 1);
		pilha.remove(topo--);
		
		return i;
	}
	
	public int push() {
		topo++;
		pilha.add(valor++);
		
		return getTopo();
	}
	
	public int getTopo() {
		return pilha.get(topo);
	}
	
	public boolean isEmpty() {
		return pilha.isEmpty();
	}
	
	public PilhaLabels() {
		topo = -1;
		valor = 0;
		pilha = new ArrayList<Integer>();
	}
	
}
