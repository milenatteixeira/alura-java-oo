
public class TesteContaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100);
		System.out.println(conta.saca(200));
		
//		proibido:
//		conta.saldo = conta.saldo - 101;
//		System.out.println(conta.saldo); //conta com saldo negativo
		
		System.out.println(conta.getSaldo());
	}
}
