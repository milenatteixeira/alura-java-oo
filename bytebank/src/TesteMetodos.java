
public class TesteMetodos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcella = new Conta();
		contaDaMarcella.deposita(1000);
		
		if(contaDaMarcella.transfere(300, conta)){
			System.out.println("transferiu");
		} else {
			System.out.println("nao transferiu");
		}
		
		System.out.println(contaDaMarcella.saldo);
		System.out.println(conta.saldo);
	}
}
