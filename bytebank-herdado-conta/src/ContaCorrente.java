public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
	}
	
	@Override
	public void saca(double valor) {
		double valorSaque = valor + .2;
		super.saca(valorSaque);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.1;
	}
	
}
