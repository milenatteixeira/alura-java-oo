
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("milena");
		funcionario.setCpf("12345");
		funcionario.setSalario(5988.97);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
	}

}
