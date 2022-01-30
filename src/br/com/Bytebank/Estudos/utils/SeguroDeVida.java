package br.com.Bytebank.Estudos.utils;
import br.com.Bytebank.Estudos.Interfaces.*;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
