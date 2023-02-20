
public class Editor extends Funcionario {
	
	public double getBonificacao(){
		System.out.println("Bonificação EDITOR.");
		return super.getBonificacao() + 500;
	}

	
}
