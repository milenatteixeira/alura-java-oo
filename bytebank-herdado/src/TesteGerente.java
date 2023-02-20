
public class TesteGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("milena");
		gerente.setSalario(15000);
		System.out.println(gerente.getNome());
		System.out.println(gerente.getSalario());
		
		System.out.println(gerente.getBonificacao());
	}
}
