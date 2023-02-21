
/*
 * Define um contrato chamado "Autenticável"
 * Quem assinar o contrato deverá implementar os métodos:
 * setSenha
 * autentica
 * 
 * */

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
