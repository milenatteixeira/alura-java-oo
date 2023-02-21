/*
 * O gerente é um funcionário e assina o contrato de Autenticavel
 * 
 * */


public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	public boolean autentica(int senha){
		if (this.senha == senha){
			return true;
		}

		return false;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao(){
		System.out.println("Bonificação GERENTE.");
		return super.getSalario();
	}

	
}
