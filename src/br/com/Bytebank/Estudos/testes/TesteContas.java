package br.com.Bytebank.Estudos.testes;

import br.com.Bytebank.Estudos.Domain.*;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(0001, 5520);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(0001, 5521);
		cp.deposita(200);
		
		cp.transfere(100, cc);
		System.out.println(cc.getSaldo());
		cc.saca(50);
		System.out.println(cc.getSaldo());

	}
}
