package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int conta) {
		super(agencia, conta);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
}
