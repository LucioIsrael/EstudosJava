package br.com.Bytebank.Estudos.testes;
import br.com.Bytebank.Estudos.Domain.*;
import br.com.Bytebank.Estudos.utils.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(200.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		CalculadorDeImposto ci = new CalculadorDeImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());

	}

}
