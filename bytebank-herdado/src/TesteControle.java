
public class TesteControle {
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		Funcionario f = new Funcionario();
		Editor e = new Editor();
		Designer d = new Designer();
		
		g.setSalario(5000);
		f.setSalario(1000);
		e.setSalario(2000);
		d.setSalario(3000);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.geraBonificacao(g);
		controle.geraBonificacao(f);
		controle.geraBonificacao(e);
		controle.geraBonificacao(d);
		
		System.out.println(controle.getSoma());
		
	}
}
