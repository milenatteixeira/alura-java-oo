
public class TestaContaVazia {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		// nullpointerexception
		//conta.titular.nome = "milena teixeira";
		
		System.out.println(conta.titular);
		
		conta.titular = new Cliente();
		conta.titular.nome = "milena teixeira";
		System.out.println(conta.titular.nome);
		
	}
}
