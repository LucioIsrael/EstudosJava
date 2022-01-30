package br.com.Bytebank.Estudos.testes;

import br.com.Bytebank.Estudos.Domain.*;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeConta guardador = new GuardadorDeConta();
		
		Conta cc = new ContaCorrente(22, 33);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(33, 22);
		guardador.adiciona(cc2);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		
		
	}
	
	
}
