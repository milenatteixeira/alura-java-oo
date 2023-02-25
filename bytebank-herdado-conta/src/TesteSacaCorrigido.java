
public class TesteSacaCorrigido {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1234, 123);
		
		conta.deposita(200);
		conta.saca(300);
		
		System.out.println(conta.saldo);
	}
}
