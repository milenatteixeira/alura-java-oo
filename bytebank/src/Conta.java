public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transfere(double valor, Conta destino){
		if(this.saca(valor)){
			destino.deposita(valor);
			return true;
		}

		return false;
	}
}
