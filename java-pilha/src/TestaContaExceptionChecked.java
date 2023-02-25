
public class TestaContaExceptionChecked {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		try {
			conta.deposita();
		} catch (MinhaException minhaException) {
			minhaException.printStackTrace();
		}
	}
}
