
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
//		conta.setAgencia(-50);
//		conta.setNumero(-50);
		
		System.out.println(conta.getAgencia() + " " + conta.getNumero());
		
		Conta conta2 = new Conta(1337, 24226);
		System.out.println(conta2);
		
		System.out.println(Conta.getTotal());
	}
}
