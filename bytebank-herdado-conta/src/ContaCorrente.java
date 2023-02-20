public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSaque = valor + .2;
		return super.saca(valorSaque);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}
	
}
