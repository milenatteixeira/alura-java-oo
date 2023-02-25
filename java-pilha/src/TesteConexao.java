
public class TesteConexao {

	public static void main(String[] args) {

		Conexao conexao = null;

		try {
			conexao = new Conexao();
			conexao.leituraDados();
		} catch (IllegalStateException exception) {
			System.out.println("Erro na conexão.");
		} finally {
			conexao.fecha();
		}
	}

}
