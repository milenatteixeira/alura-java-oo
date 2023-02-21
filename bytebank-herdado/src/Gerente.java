/*
 * O gerente é um funcionário e assina o contrato de Autenticavel
 * 
 * */


public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Gerente(){
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public double getBonificacao(){
		System.out.println("Bonificação GERENTE.");
		return super.getSalario();
	}

	
}
