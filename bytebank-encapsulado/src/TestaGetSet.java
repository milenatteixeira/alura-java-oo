
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 12345);
		
		System.out.println(conta.getNumero());
		
		Cliente cliente = new Cliente();
//		conta.titular = cliente;
		
		cliente.setNome("milena teixeira");
		
		conta.setTitular(cliente);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
	}
}
