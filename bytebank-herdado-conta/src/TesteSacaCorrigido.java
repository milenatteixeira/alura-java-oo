
public class TesteSacaCorrigido {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1234, 123);
		
		conta.deposita(200);
		
		try {
			conta.saca(300);
		} catch(SaldoInsuficienteException ex){
			System.out.println(ex.getMessage());
		}
		
		System.out.println(conta.saldo);
	}
}
