
public class ControleBonificacao {
	
	private double soma;
	
	public void geraBonificacao(Funcionario f){
		double bonificacao = f.getBonificacao();
		
		this.soma += bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}

}
