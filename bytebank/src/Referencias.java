
public class Referencias {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		segundaConta.saldo = 500;
		
		System.out.println(primeiraConta.saldo);
	}
}
