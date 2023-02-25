
public class TesteConexao {

	public static void main(String[] args) {

		try(Conexao conexao = new Conexao()) {
			conexao.leituraDados();
		} catch (IllegalStateException exception) {
			System.out.println("Erro na conexão.");
		}
	}

}
