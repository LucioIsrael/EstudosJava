package br.com.Bytebank.Estudos.Domain;
import java.text.DecimalFormat;

import br.com.Bytebank.Estudos.Exceptions.*;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	private DecimalFormat formatador = new DecimalFormat("0.00");

	public abstract void deposita (double valor);
	
	
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total de conta " + getTotal());
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
	}
	
	public void saca (double valor) {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Valor insuficiente para saque");
		};
		this.saldo -= valor;
		formatador.format(valor);
	}
	
	public void transfere (double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
		
	}
	
	public double getSaldo() {
		return this.saldo;
		
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Não pode valor menor que 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor que 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
}