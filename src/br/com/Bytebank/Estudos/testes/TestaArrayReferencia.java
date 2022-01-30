package br.com.Bytebank.Estudos.testes;

import br.com.Bytebank.Estudos.Domain.*;

//
//import Domain.Conta;
//import Domain.ContaCorrente;
//import Domain.ContaPoupanca;
//
public class TestaArrayReferencia {
//
//	public static void main(String[] args) {
//		ContaCorrente conta = new ContaCorrente(22, 33);
//		ContaPoupanca conta1 = new ContaPoupanca(33, 22);
//
//		Object[] refs = new Object[5];
//		
//		refs[0] = conta;
//		refs[1] = conta1;
//		
//
	
	public static void main(String[] args) {
		Cliente clienteNormal = new Cliente("2323", "3232");
		clienteNormal.setNome("Flavio");

		Cliente clienteVip = new Cliente("3232", "23123");
		clienteVip.setNome("Romulo");

		Object[] refs = new Object[5];
		refs[0]  = clienteNormal;
		refs[1]  = clienteVip;
		
		
		
		System.out.println(((Cliente) refs[1]).getNome());
	}
	


//		ContaPoupanca ref = (ContaPoupanca) refs[1];
//		
//		System.out.println(ref.getAgencia());
//	}
//	
}

