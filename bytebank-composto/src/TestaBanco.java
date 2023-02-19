
public class TestaBanco {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.nome = "milena teixeira";
		cliente.cpf = "12345678925";
		cliente.profissao = "programador";
		
		Conta conta = new Conta();
		conta.deposita(100);
		conta.titular = cliente;
		
		System.out.println(conta.titular.nome);
	}
}
