package br.com.Bytebank.Estudos.Exceptions;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException (String msg) {
		super(msg);
	}
	
}
