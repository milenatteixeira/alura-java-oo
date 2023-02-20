
public class Designer extends Funcionario {
	
	public double getBonificacao(){
		System.out.println("Bonificação DESIGNER.");
		return super.getBonificacao() + 100;
	}

	
}
