package models;

import java.util.ArrayList;

public class PilhaIteracao {
	private int topo;
	private ArrayList<Integer> pilha;
	
	public void pop() {
		pilha.remove(topo--);	
	}
	
	public void push(int i) {
		topo++;
		pilha.add(i);
	}
	
	public int getTopo() {
		return topo;
	}
	
	public boolean isEmpty() {
		return pilha.isEmpty();
	}
	
	public PilhaIteracao() {
		this.topo = -1;
		this.pilha = new ArrayList<Integer>();
	}
	
}
