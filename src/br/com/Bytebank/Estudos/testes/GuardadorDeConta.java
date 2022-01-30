package br.com.Bytebank.Estudos.testes;

import br.com.Bytebank.Estudos.Domain.*;

public class GuardadorDeConta {

	
	private Conta[] referencias;
	private int posicao;
	
	public GuardadorDeConta() {
		this.referencias = new Conta[10];
		posicao = 0;
		
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicao] = ref;
		posicao++;
	}
	
	public int getQuantidadeElementos() {
		return this.posicao;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
}
