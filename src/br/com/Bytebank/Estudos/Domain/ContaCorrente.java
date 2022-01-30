package br.com.Bytebank.Estudos.Domain;

import br.com.Bytebank.Estudos.Interfaces.*;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {

		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public void saca(double valor) {
		double ValorSaque = valor + 0.2;
		super.saca(ValorSaque);
	}

	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
